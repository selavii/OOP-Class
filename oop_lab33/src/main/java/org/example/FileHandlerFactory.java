package org.example;

public class FileHandlerFactory {

    public static FileHandler getFileHandler(CustomFile file, String directoryPath) {
        String extension = file.getExtension();

        // Handle specific file types based on their extension
        switch (extension) {
            case "jpg":
            case "png":
                return new ImageFileHandler(file);  // Assuming you have an ImageFileHandler
            case "txt":
                return new TextFileHandler(file, directoryPath);
            case "java":
                return new ProgramFileHandler(file, directoryPath);
            default:
                return new GenericFileHandler(file);
        }
    }
}
