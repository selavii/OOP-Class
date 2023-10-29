package org.example;
import org.example.ImageFile;
import org.example.TextFile;
import org.example.ProgramFile;



import java.time.LocalDateTime;

public class File {
    protected String name;
    protected String extension;
    protected LocalDateTime createdTime;
    protected LocalDateTime updatedTime;

    public File(String name, String extension) {
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
}

