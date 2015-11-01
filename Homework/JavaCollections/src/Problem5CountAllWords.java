//Write a program to count the number of words in given sentence. Use any non-letter character as word separator.
//        I am coming...                  // 3

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem5CountAllWords{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Pattern pattern = Pattern.compile("(\\w{1,})");
        Matcher matcher = pattern.matcher(line);
        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        System.out.println(counter);
    }
}
