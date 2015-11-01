//Write a program that recursively calculates factorial.

import java.util.Scanner;

public class Problem16CalculateFactorialN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, c, fact = 1;
        n = in.nextInt();
        if (n < 0) {
            System.out.println("Number should be non-negative.");
        }else {
            for (c = 1; c <= n ; c++) {
                fact = fact * c;
            }
        }
        System.out.println("Factorial of "+n+" is = " + fact);
    }
}
