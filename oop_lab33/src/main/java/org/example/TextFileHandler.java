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
            StringBuilder contentBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
            reader.close();

            String content = contentBuilder.toString();
            String[] lines = content.split("\\.");

            int lineCount = lines.length;
            int wordCount = content.split("\\s+").length;
            int charCount = content.length();

            System.out.println("This is a text file. Name: " + file.getName() + ", Extension: " + file.getExtension());
            System.out.println("Created: " + createdTime + ", Updated: " + modifiedTime);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
