package org.example;

import java.time.LocalDateTime;

public class CustomFile {
    protected String name;
    protected String extension;
    protected LocalDateTime createdTime;
    protected LocalDateTime updatedTime;
    protected String filePath;

    public CustomFile(String name, String extension) {
        this.name = name;
        this.extension = extension;
        this.createdTime = LocalDateTime.now();
        this.updatedTime = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public void setFilePath(String filePath) { // New setter for filePath
        this.filePath = filePath;
    }

    public String getFilePath() { // Getter for filePath
        return filePath;
    }

    public void printInfo() {
        System.out.println(this.extension);
        System.out.println(this.name);
    }
}
