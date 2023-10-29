package org.example;

public abstract class FileHandler {
    protected CustomFile file;

    public FileHandler(CustomFile file) {
        this.file = file;
    }

    public abstract void printInfo();
}
