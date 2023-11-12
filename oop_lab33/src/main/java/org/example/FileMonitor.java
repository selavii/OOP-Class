package org.example;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

public class FileMonitor {

    private String directoryPath;
    private LocalDateTime lastSnapshot;
    private Map<String, Long> fileModificationTimes;

    public FileMonitor(String directoryPath) {
        this.directoryPath = directoryPath;
        this.lastSnapshot = LocalDateTime.now();
        this.fileModificationTimes = new HashMap<>();
        updateFileModificationTimes();
    }

    public void commit() {
        this.lastSnapshot = LocalDateTime.now();
        updateFileModificationTimes();
        System.out.println("Snapshot time updated.");
    }

    public void info(String fileName) {
        File ioFile = new File(directoryPath, fileName);
        if (!ioFile.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        String extension = getFileExtension(fileName);

        CustomFile customFile;

        switch (extension) {
            case "jpg":
            case "png":
                customFile = new ImageFile(fileName, extension, "unknown");
                break;
            case "txt":
                customFile = new TextFile(fileName, extension);
                break;
            case "java":
                customFile = new ProgramFile(fileName, extension);
                break;
            default:
                customFile = new CustomFile(fileName, extension);
                break;
        }


        customFile.setFilePath(ioFile.getAbsolutePath());

        FileHandler handler = FileHandlerFactory.getFileHandler(customFile, directoryPath);
        handler.printInfo();
    }

    public void status() {
        System.out.println("Checking status...");

        File dir = new File(directoryPath);
        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Error reading directory.");
            return;
        }

        for (File file : files) {
            long lastModifiedTime = file.lastModified();

            if (fileModificationTimes.containsKey(file.getName())) {
                long previousModifiedTime = fileModificationTimes.get(file.getName());

                if (lastModifiedTime > previousModifiedTime) {
                    System.out.println(file.getName() + " - Changed");
                } else {
                    System.out.println(file.getName() + " - No Change");
                }
            } else {
                System.out.println(file.getName() + " - Not tracked");
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

    private String getFileExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1);
        }
        return "";
    }

    private void updateFileModificationTimes() {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Error reading directory.");
            return;
        }

        for (File file : files) {
            long lastModifiedTime = file.lastModified();
            fileModificationTimes.put(file.getName(), lastModifiedTime);
        }
    }
}
