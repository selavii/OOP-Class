package org.example;
import java.io.File;

public class GenericFileHandler extends FileHandler {

    public GenericFileHandler(File file) {
        super(file);
    }

    @Override
    public void printInfo() {
        System.out.println("This is a generic file named: " + file.getName());
    }
}
