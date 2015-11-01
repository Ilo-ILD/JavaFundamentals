import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Pattern pat = Pattern.compile("(\\b[A-Z](\\B[a-zA-z]|)+[A-Z]\\b)");
        Matcher matcher = pat.matcher(line);

        while (matcher.find()){
            System.out.print(matcher.group()+ " ");
        }
    }
}
