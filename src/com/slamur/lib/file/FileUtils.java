package com.slamur.lib.file;

import java.io.File;
import java.io.IOException;

public class FileUtils implements FileConstants {

    public static File getExistingFile(String fileName) {
        File file = null;

        try {
            file = new File(fileName);
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("File " + fileName + " can't be created:");
            e.printStackTrace();
        }

        return file;
    }

    public static File getExistingFile(String fileName, String extension) {
        return getExistingFile(fileName + DOT + extension);
    }
}
