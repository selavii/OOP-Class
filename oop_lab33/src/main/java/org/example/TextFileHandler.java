package org.example;
import java.io.File;

public class TextFileHandler extends FileHandler {

    public TextFileHandler(File file) {
        super(file);
    }

    @Override
    public void printInfo() {
        System.out.println("This is a Text file named: " + file.getName());
    }
}
