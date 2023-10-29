package org.example;

public class ProgramFileHandler extends FileHandler {

    public ProgramFileHandler(CustomFile file) {
        super(file);
    }

    @Override
    public void printInfo() {

        System.out.println("This is a program file. Name: " + file.getName() + ", Extension: " + file.getExtension());

    }
}
