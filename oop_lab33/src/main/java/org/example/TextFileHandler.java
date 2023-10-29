package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileHandler extends FileHandler {

    public TextFileHandler(CustomFile file) {
        super(file);
    }

    @Override
    public void printInfo() {
        System.out.println("This is a text file. Name: " + file.getName() + ", Extension: " + file.getExtension());
        System.out.println("Created: " + file.getCreatedTime() + ", Updated: " + file.getUpdatedTime());

        // Check if file name already contains the extension
        String completeFileName = file.getName().endsWith("." + file.getExtension()) ? file.getName() : file.getName() + "." + file.getExtension();

        // Extract metrics from the actual file
        try {
            Path filePath = Paths.get(completeFileName);
            BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()));
            String line;
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            reader.close();
            System.out.println("Lines: " + lineCount + ", Words: " + wordCount + ", Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
