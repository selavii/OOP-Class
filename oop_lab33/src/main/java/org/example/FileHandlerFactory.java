package org.example;

public class FileHandlerFactory {

    public static FileHandler getFileHandler(CustomFile file) {
        String extension = file.getExtension();

        if (file instanceof ImageFile) {
            return new ImageFileHandler(file);
        }

        switch (extension) {
            case "txt":
                return new TextFileHandler(file);
            case "py":
            case "java":
                return new ProgramFileHandler(file);
            default:
                return new GenericFileHandler(file);
        }
    }
}
