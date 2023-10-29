package org.example;
import org.example.File;
import org.example.FileHandler;
import org.example.FileMonitor;
import java.io.File;

public class FileHandlerFactory {

    public static FileHandler getFileHandler(File file) {
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
