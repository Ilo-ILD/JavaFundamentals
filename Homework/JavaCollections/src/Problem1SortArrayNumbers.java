//Write a program to enter a number n and n integer numbers and sort and print them. Keep the numbers in array of integers: int[]. Examples:
//        7         6 5 4 10 -3 120 4             //-3 4 4 5 6 10 120

        import java.util.*;

public class Problem1SortArrayNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] intList = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int numbers = in.nextInt();
            intList[i] = numbers;
        }
        Arrays.sort(intList);
        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i] + " ");
        }

    }
}
