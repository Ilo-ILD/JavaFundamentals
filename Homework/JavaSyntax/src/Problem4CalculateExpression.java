
import java.util.Locale;
import java.util.Scanner;

public class Problem4CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US", "US"));
        Scanner in = new Scanner(System.in);
        float numA = in.nextFloat();
        float numB = in.nextFloat();
        float numC = in.nextFloat();

        double resultF1 = Math.pow((Math.pow(numA, 2) + Math.pow(numB, 2)) / ((Math.pow(numA, 2) - Math.pow(numB, 2))), ((numA + numB + numC) / Math.sqrt(numC)));
        double resultF2 = Math.pow((Math.pow(numA, 2) + Math.pow(numB, 2)) - Math.pow(numC, 3), (numA - numB));
        double averageABC = (numA + numB + numC)/3;
        double avarageF1F2 = (resultF1 + resultF2)/2;

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", resultF1, resultF2, avarageF1F2 - averageABC);
    }
}
