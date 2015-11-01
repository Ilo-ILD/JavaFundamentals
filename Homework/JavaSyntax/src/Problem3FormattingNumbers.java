import java.util.Locale;
import java.util.Scanner;

public class Problem3FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US", "US"));

        Scanner in = new Scanner(System.in);
        int numA = in.nextInt();
        double numB = in.nextDouble();
        double numC = in.nextDouble();

        System.out.printf("|%1$s \t |%4$s| \t %2$.2f|%3$.3f \t|", Integer.toString(numA, 16).toUpperCase(), numB, numC, String.format("%10s", Integer.toBinaryString(numA)).replace(' ', '0'));
    }
}
