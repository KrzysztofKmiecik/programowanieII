package Ex5SumLiczbZeStringa;

public class Main {
    public static void main(String[] args) {
        String input = "aaa----abc17--13xyz";

        Integer number = sum(input);

        System.out.println(String.format("Wynik dodawania %d", number));
    }

    static Integer sum(final String input) {
        final String[] myFilteredTab = input.split("[\\-]?[^0-9\\-+]");//[a-zA-Z\\s]+" //"[^0-9]+" //"^\\d+" //"\\D+"
        Integer number = 0;
        for (String word : myFilteredTab) {
            int minusIndex=word.indexOf('-');
            if(minusIndex>0){
                String liczb1Str=word.substring(0,minusIndex);
                String liczb2Str=word.substring(minusIndex);
//                int liczba1=Integer.parseInt(liczb1Str);
//                suma+=liczba1;
//                int liczba2=Integer.parseInt(liczb2Str);
//                suma+=liczba2;
            }
            if (word.equals("")) { //!word.isEmpty()
                continue;
            }
//            if((!word.isEmpty())&&(word.matches("[0-9]+"))) {
//                number += Integer.parseInt(word); //Integer.valueOf(word)
//            }
        }
        return number;
    }
}
