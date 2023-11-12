package org.example;

public class FileHandlerFactory {

    public static FileHandler getFileHandler(CustomFile file, String directoryPath) {
        String extension = file.getExtension();


        switch (extension) {
            case "jpg":
            case "png":
                return new ImageFileHandler(file);
            case "txt":
                return new TextFileHandler(file, directoryPath);
            case "java":
                return new ProgramFileHandler(file, directoryPath);
            default:
                return new GenericFileHandler(file);
        }
    }
}
