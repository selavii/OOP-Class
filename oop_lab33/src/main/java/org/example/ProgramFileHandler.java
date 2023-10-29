package org.example;
import java.io.File;

public class ProgramFileHandler extends FileHandler {

    public ProgramFileHandler(File file) {
        super(file);
    }

    @Override
    public void printInfo() {
        System.out.println("This is a Program file named: " + file.getName());
    }
}
