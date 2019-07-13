package Ex2WhatLanguage;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        DetectLanguage.apiKey = "f1cf254869d510aee414b7eb01e2f06e";

// Enable secure mode (SSL) if passing sensitive information
// DetectLanguage.ssl = true;
        List<String> paths = new ArrayList<>();
        paths.add("E:\\JAVA\\sda\\SZKOLENIE\\Projects\\programowanieII\\src\\main\\resources\\chunichi.txt");
        paths.add("focus-1.txt");
        paths.add("focus-2.txt");
        paths.add("la-vanguardia.txt");
        paths.add("publico.txt");
        paths.add("zeit.txt");
        Locale locale;
        for (String path : paths) {
            locale= new Locale(detect(path));
            System.out.println(String.format("Plik %s \t to język %s",path,locale.getDisplayCountry()));
        }


    }

    private static String detect(final String path1) {
        FileNIO fileNIO = new FileNIO(path1);
        try {

            String language = DetectLanguage.simpleDetect(fileNIO.readFromFile().toString());
          return   language;
        } catch (APIError apiError) {
            apiError.printStackTrace();
            return new String("Error");
        }

    }
}
