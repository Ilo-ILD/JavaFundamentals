import java.util.Scanner;

public class Problem5ConvertFromDecimalSystemBase7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(Integer.toString(num, 7));

    }
}
