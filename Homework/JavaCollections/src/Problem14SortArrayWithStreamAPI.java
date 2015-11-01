//Use the .sorted() method to sort an array of integers. The first line of input is the array. The second is the sorting order.
//6 8 3 1 7 2 2 5
//        Ascending or Decending

import java.util.Arrays;
import java.util.Scanner;

public class Problem14SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] numbersAll = in.nextLine().split(" ");
        int[] intList = new int[numbersAll.length];
        for (int i = 0; i < intList.length; i++) {
            intList[i] = Integer.parseInt(numbersAll[i]);
        }
        String choice = in.nextLine();
        Arrays.sort(intList);
        if (choice.contains("Ascending")){

            for (int i = 0; i < intList.length; i++) {
                System.out.print(intList[i] + " ");
            }
        }else {
            for (int i = intList.length - 1; i > 0; i--) {
                System.out.print(intList[i] + " ");
            }

        }
    }
}
