package org.example;

public class TextFileHandler extends FileHandler {

    public TextFileHandler(CustomFile file) {
        super(file);
    }

    @Override
    public void printInfo() {

        System.out.println("This is a text file. Name: " + file.getName() + ", Extension: " + file.getExtension());

    }
}
