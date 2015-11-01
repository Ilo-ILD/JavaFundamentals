import java.util.Scanner;

public class SumNumbersFromOneToN{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println((num * (num + 1) / 2));
    }
}