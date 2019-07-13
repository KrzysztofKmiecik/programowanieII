package Ex2WhatLanguage;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        DetectLanguage.apiKey = "f1cf254869d510aee414b7eb01e2f06e";

        File folder = new File("src\\main\\resources");
        File[] files = folder.listFiles();
      //  File file = new File("src\\main\\resources\\chunichi.txt");
        Locale locale;

        for (File myFile : files) {
            Scanner scanner = new Scanner(myFile);
            String myText = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // System.out.println("Linijka" + line);
                myText += line;
            }
            try {
                String language = DetectLanguage.simpleDetect(myText);
                locale=new Locale(language);
                System.out.println(String.format("File  %s \t is written in  %s %s language",
                        myFile.getName(),language, locale.getDisplayLanguage(locale)));
            } catch (APIError apiError) {
                apiError.printStackTrace();
                System.out.println("Error");
            }


        }

    }

}
