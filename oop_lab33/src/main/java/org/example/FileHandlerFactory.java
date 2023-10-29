package org.example;

public class FileHandlerFactory {

    public static FileHandler getFileHandler(CustomFile file) {
        String extension = file.getExtension();
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
}
