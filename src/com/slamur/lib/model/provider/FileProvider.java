package com.slamur.lib.model.provider;

import com.slamur.lib.file.Extensions;
import com.slamur.lib.file.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FileProvider<ValueType> extends ProviderImpl<ValueType> {

    public interface FileStrategy<ValueType> extends Extensions {

        ValueType readValue(StringTokenizer tok);
        void printValue(PrintWriter out, ValueType value);
    }

    private FileStrategy<ValueType> fileStrategy;

    private String fileName;
    private String extension, delimiter;

    public FileProvider(FileStrategy<ValueType> fileStrategy) {
        this.fileStrategy = fileStrategy;

        this.fileName = "";
        this.extension = "";
        this.delimiter = "";
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<ValueType> loadValues() {
        File file = FileUtils.getExistingFile(fileName, extension);

        List<ValueType> values = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            for (String line; (line = in.readLine()) != null; ){
                StringTokenizer tok = new StringTokenizer(line, delimiter);

                ValueType value = fileStrategy.readValue(tok);
                if (value != null) {
                    values.add(value);
                }
            }
        } catch (IOException e) {
            System.err.println("Problem with values loading:");
            e.printStackTrace();
        }

        return values;
    }

    @Override
    public void saveValues(List<ValueType> values) {
        File file = FileUtils.getExistingFile(fileName, extension);

        try (PrintWriter out = new PrintWriter(file)) {
            for (ValueType value : values) {
                fileStrategy.printValue(out, value);

                out.println();
            }
        } catch (IOException e) {
            System.err.println("Problem with values saving:");
            e.printStackTrace();
        }
    }
}
