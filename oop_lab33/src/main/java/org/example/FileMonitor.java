package org.example;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


import org.example.FileHandler;
import org.example.FileHandlerFactory;

public class FileMonitor {

    private String directoryPath;
    private LocalDateTime lastSnapshot;

    public FileMonitor(String directoryPath) {
        this.directoryPath = directoryPath;
        this.lastSnapshot = LocalDateTime.now();
    }

    public void commit() {
        this.lastSnapshot = LocalDateTime.now();
        System.out.println("Snapshot time updated.");
    }

    public void info(String fileName) {
        File file = new File(directoryPath, fileName);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        FileHandler handler = FileHandlerFactory.getFileHandler(file);
        handler.printInfo();
    }

    public void status() {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Error reading directory.");
            return;
        }

        for (File file : files) {
            if (file.lastModified() > lastSnapshot.toInstant(ZoneOffset.UTC).toEpochMilli()) {
                System.out.println(file.getName() + " - Changed");
            } else {
                System.out.println(file.getName() + " - No Change");
            }
        }
    }

    public boolean processCommand(String input) {
        String[] commandParts = input.split(" ", 2);
        String command = commandParts[0].toLowerCase();

        switch (command) {
            case "commit":
                commit();
                return true;
            case "info":
                if (commandParts.length > 1) {
                    info(commandParts[1]);
                } else {
                    System.out.println("Please specify a filename.");
                }
                return true;
            case "status":
                status();
                return true;
            case "exit":
                System.out.println("Exiting the File Monitor System. Goodbye!");
                return false;
            default:
                System.out.println("Invalid command.");
                return true;
        }
    }
}
