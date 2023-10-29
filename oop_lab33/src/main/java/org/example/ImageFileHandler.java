package org.example;

public class ImageFileHandler extends FileHandler {

    public ImageFileHandler(CustomFile file) {
        super(file);
    }

    @Override
    public void printInfo() {

        System.out.println("This is an image file. Name: " + file.getName() + ", Dimensions: " + ((ImageFile) file).getDimensions());
    }
}
