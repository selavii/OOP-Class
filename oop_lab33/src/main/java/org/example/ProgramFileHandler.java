package org.example;

public class ProgramFileHandler extends FileHandler {

    public ProgramFileHandler(CustomFile file) {
        super(file);
    }

    @Override
    public void printInfo() {
        // No need to call super.printInfo(); as it's abstract in the superclass

        System.out.println("This is a program file. Name: " + file.getName() + ", Extension: " + file.getExtension());

        // Placeholder values
        int lineCount = 200;
        int classCount = 5;
        int methodCount = 20;

        System.out.println("Line Count: " + lineCount);
        System.out.println("Class Count: " + classCount);
        System.out.println("Method Count: " + methodCount);
    }
}
