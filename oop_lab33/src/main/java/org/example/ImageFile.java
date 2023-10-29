package org.example;

public class ImageFile extends File {
    private String dimensions;

    public ImageFile(String name, String extension, String dimensions) {
        super(name, extension);
        this.dimensions = dimensions;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
