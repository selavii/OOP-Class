package org.example;
import org.example.FileHandler;
import org.example.FileHandlerFactory;
import java.io.File;


public abstract class FileHandler {
    protected File file;

    public FileHandler(File file) {
        this.file = file;
    }

    public abstract void printInfo();
}
