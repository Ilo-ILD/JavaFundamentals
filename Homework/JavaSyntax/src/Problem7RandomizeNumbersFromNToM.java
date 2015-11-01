import java.util.Random;
import java.util.Scanner;

public class Problem7RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        Random ran = new Random();

        if (n == m) {
            System.out.println(n);
        }
        if (n > m){

            for (int i = m; i <= n; i++) {
                int x = ran.nextInt((n - m) + 1) + m;
                System.out.print(x + " ");
            }
        }
        else {

            for (int i = n; i <= m; i++) {
                int x = ran.nextInt((m - n) + 1) + n;
                System.out.print(x + " ");
            }
        }
    }
}
