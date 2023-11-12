package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFileHandler extends FileHandler {

    public ImageFileHandler(CustomFile file) {
        super(file);
    }

    @Override
    public void printInfo() {
        if (file instanceof ImageFile) {
            System.out.println("This is an image file. Name: " + file.getName());
            String filePath = ((ImageFile) file).getFilePath();

            try {
                File imageFile = new File(filePath);
                BufferedImage bufferedImage = ImageIO.read(imageFile);

                if (bufferedImage != null) {
                    int width = bufferedImage.getWidth();
                    int height = bufferedImage.getHeight();
                    System.out.println("Dimensions: " + width + "x" + height);
                } else {
                    System.out.println("Error: Unable to read image dimensions.");
                }
            } catch (IOException e) {
                System.out.println("Error reading the image file: " + e.getMessage());
            }
        } else {
            System.out.println("Error: Invalid file type for ImageFileHandler.");
        }
    }
}
