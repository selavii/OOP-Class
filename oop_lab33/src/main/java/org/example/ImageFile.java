package org.example;

public class ImageFile extends CustomFile {
    private String dimensions;

    public ImageFile(String name, String extension, String dimensions) {
        super(name, extension);
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }
}
