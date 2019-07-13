package Ex1Sms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //   String str = "Dzisiaj jest sobota, imieniny kota";
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj text:");
        String str = input.nextLine();
        String shorter = new String(makeSMSShorter(str));
        System.out.println(shorter);
        System.out.println(String.format("Zapłacisz za %d sms", howManySMS(shorter)));

    }

    public static String makeSMSShorter(String str) {
        if (str == null) {
            return null;
        }
        final String[] words = str.split("[\\s,]+");

        String shortWorld = "";
        for (String word : words) {
            shortWorld += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }
        return shortWorld;
    }

    public static int howManySMS(String sms) {
        System.out.println(String.format("Dlugosc stringa %d", sms.length()));
        int dl = sms.length();
        dl = 150;
        double howMany = dl / 160;

        if (dl % 160 > 0) {
            return 1 + (int) howMany;
        } else {
            return (int) howMany;
        }


    }
}
