package org.example;

import java.io.File;  // Corrected import

public class FileHandlerFactory {

    public static FileHandler getFileHandler(File file) {  // Using the standard File import
        String extension = getFileExtension(file.getName());
        switch (extension) {
            case "txt":
                return new TextFileHandler(file);
            case "png":
            case "jpg":
                return new ImageFileHandler(file);
            case "py":
            case "java":
                return new ProgramFileHandler(file);
            default:
                return new GenericFileHandler(file);
        }
    }

    private static String getFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf(".");
        return (dotIndex == -1) ? "" : filename.substring(dotIndex + 1).toLowerCase();
    }
}
