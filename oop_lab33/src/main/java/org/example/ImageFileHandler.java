package org.example;

public class ImageFileHandler extends FileHandler {

    public ImageFileHandler(CustomFile file) {
        super(file);
    }

    @Override
    public void printInfo() {
        if(file instanceof ImageFile) {
            System.out.println("This is an image file. Name: " + file.getName() + ", Dimensions: " + ((ImageFile) file).getDimensions());
        } else {
            System.out.println("Error: Invalid file type for ImageFileHandler.");
        }
    }
}
