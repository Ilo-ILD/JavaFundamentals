//Write a program to find how many times given string appears in given text as substring.
//        The text is given at the first input line. The search string is given at the second input line.
//        The output is an integer number. Please ignore the character casing. Examples:
//        aaaaaa              //        aa

import java.util.Scanner;

public class Problem7CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().toLowerCase();
        String wordOrSimbol = in.nextLine();
        System.out.println(howManyTimes(line, wordOrSimbol));
    }
    private static int howManyTimes(String console, String key){

        int countReapiting = 0;
        int countForKey = 0;

        for (int i = 0; i < console.length(); i++) {
            int index = console.indexOf(key, countForKey);
            if (i != index){
                continue;
            }
            countReapiting++;
            countForKey = index + 1;
        }
        return countReapiting != 0 ? countReapiting : 0;
    }
}
