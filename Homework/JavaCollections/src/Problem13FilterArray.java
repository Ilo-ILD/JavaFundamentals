//Write a program that filters an array of strings, leaving only the strings with length greater than 3 characters.
//Gosho gos pesho pes blabla bla //Gosho pesho blabla

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem13FilterArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String words = in.nextLine();
        Pattern pattern = Pattern.compile("\\w{4,}");
        Matcher matcher = pattern.matcher(words);
        int count =0;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            count++;
        } if (count == 0){
            System.out.println("(empty)");
        }
    }
}
