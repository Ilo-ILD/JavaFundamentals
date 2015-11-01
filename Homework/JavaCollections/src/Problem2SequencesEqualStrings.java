//Write a program that enters an array of strings and finds in it all sequences of equal elements.
//        The input strings are given as a single line, separated by a space. Examples:
//        hi yes yes yes bye              //hi       yes yes yes           bye

import java.util.Scanner;

public class Problem2SequencesEqualStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].matches(words[i])){
                System.out.print(words[i - 1] + " ");
            }else if (!words[i - 1].equals(words[i])){
                System.out.println(words[i -1]);
            }
        }
        if (words[words.length -2].equals(words[words.length -1])){
            System.out.print(words[words.length-1] + " ");
        }else {
            System.out.println(words[words.length -1]);
        }
    }
}
