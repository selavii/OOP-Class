package org.example;

public class GenericFileHandler extends FileHandler {

    public GenericFileHandler(CustomFile file) {  // Adjusted to CustomFile here
        super(file);
    }

    @Override
    public void printInfo() {
        System.out.println("This is a generic file. Name: " + file.getName());
    }
}
