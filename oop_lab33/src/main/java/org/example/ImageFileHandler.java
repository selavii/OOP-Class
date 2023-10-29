package org.example;
import java.io.File;

public class ImageFileHandler extends FileHandler {

    public ImageFileHandler(File file) {
        super(file);
    }

    @Override
    public void printInfo() {
        System.out.println("This is an Image file named: " + file.getName());
    }
}
