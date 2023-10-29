package org.example;
import java.io.File;


public abstract class FileHandler {
    protected File file;

    public FileHandler(File file) {
        this.file = file;
    }

    public abstract void printInfo();
}
