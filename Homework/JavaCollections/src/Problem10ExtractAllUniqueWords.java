//At the first line at the console you are given a piece of text. Extract all words from it and print
//        them in alphabetical order. Consider each non-letter character as word separator. Take the repeating
//        words only once. Ignore the character casing. Print the result words in a
//        single line, separated by spaces. Examples:
//        Welcome to SoftUni. Welcome to Java.	    //java to softuni welcome

import java.util.*;

public class Problem10ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split("\\W");
        HashSet<String> dictionary = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            if (!dictionary.contains(words[i].toLowerCase())){
                dictionary.add(words[i].toLowerCase());
            }
        }
        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(dictionary);
        System.out.println(myTreeSet);
    }
}
