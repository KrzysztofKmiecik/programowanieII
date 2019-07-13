package Ex2WhatLanguage;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileNIO {
    final private String sPath;

    public FileNIO(final String path) {
        this.sPath = path;
    }


    public void writeToFile(String stringToWrite) {
        Path path = Paths.get(this.sPath);
        try (BufferedWriter writer =
                     Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                             StandardOpenOption.CREATE,
                             StandardOpenOption.APPEND)) {
            writer.write(stringToWrite);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public List<String> readFromFile() {
        List<String> myList = new ArrayList<>();
        Path path = Paths.get(this.sPath);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                myList.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
        return myList;
    }

    @Override
    public String toString() {

        return StringUtils.join(readFromFile(), "\n");
    }
}
