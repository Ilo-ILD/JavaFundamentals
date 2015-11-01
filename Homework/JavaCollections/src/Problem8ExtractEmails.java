//Write a program to extract all email addresses from given text.
//        Please contact us at: support@github.com. 	            //     support@github.com

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8ExtractEmails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Pattern pattern = Pattern.compile("\\w[-._\\w]*\\w@\\w[-._\\w]*\\w\\.[A-Za-z]{2,3}");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
