package org.example;

import java.io.File;
import org.example.FileHandlerFactory;
public abstract class FileHandler {
    protected File file;

    public FileHandler(File file) {
        this.file = file;
    }

    public abstract void printInfo();
}
