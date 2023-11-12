package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TextFileHandler extends FileHandler {

    private String directoryPath;

    public TextFileHandler(CustomFile file, String directoryPath) {
        super(file);
        this.directoryPath = directoryPath;
    }

    @Override
    public void printInfo() {
        Path filePath = Paths.get(directoryPath, file.getName());

        try {
            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            LocalDateTime createdTime = LocalDateTime.ofInstant(attrs.creationTime().toInstant(), ZoneId.systemDefault());
            LocalDateTime modifiedTime = LocalDateTime.ofInstant(attrs.lastModifiedTime().toInstant(), ZoneId.systemDefault());

            BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()));
            String line;
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }
            reader.close();

            System.out.println("This is a text file. Name: " + file.getName() + ", Extension: " + file.getExtension());
            System.out.println("Created: " + createdTime + ", Updated: " + modifiedTime);
            System.out.println("Lines: " + lineCount + ", Words: " + wordCount + ", Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
