package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramFileHandler extends FileHandler {

    private String directoryPath;

    public ProgramFileHandler(CustomFile file, String directoryPath) {
        super(file);
        this.directoryPath = directoryPath;
    }

    @Override
    public void printInfo() {
        System.out.println("This is a program file. Name: " + file.getName() + ", Extension: " + file.getExtension());

        Path filePath = Paths.get(directoryPath, file.getName());

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            int lineCount = 0;
            int classCount = 0;
            int methodCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (line.contains("class ")) {
                    classCount++;
                }
                // Basic method count - can be improved
                if (line.contains("void ") || line.contains("int ") || line.contains("String ")) {
                    methodCount++;
                }
            }

            System.out.println("Line Count: " + lineCount);
            System.out.println("Class Count: " + classCount);
            System.out.println("Method Count: " + methodCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
