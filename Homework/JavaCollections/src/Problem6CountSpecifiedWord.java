//Write a program to find how many times a word appears in given text. The text is given at the first
//        input line. The target word is given at the second input line. The output is an integer number.
//        Please ignore the character casing. Consider that any non-letter character is a word separator.
//        Examples: I am coming...
//        hello                               // 0

        import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6CountSpecifiedWord {       //komentar za Proverqvashtiq primer Edno e sgreshen "Welcome" trqbva da e s Glavno "W" za da dava 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String patern = in.nextLine();
        Pattern pattern = Pattern.compile("\\b"+patern);
        Matcher matcher = pattern.matcher(line);
        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        if (counter > 0){
            System.out.println(counter);
        }else {
            System.out.println("0");
        }
    }
}
