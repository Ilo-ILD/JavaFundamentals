//Write a program to find all increasing sequences inside an array of integers. The integers
//        are given on a single line, separated by a space. Print the sequences in the order
//        of their appearance in the input array, each at a single line. Separate the sequence
//        elements by a space. Find also the longest increasing sequence and print it at the last line.
//        If several sequences have the same longest length, print the left-most of them. Examples:
//        2 3 4 1 50 2 3 4 5
//        2 3 4
//        1 50
//        2 3 4 5
//        Longest: 2 3 4 5

import java.util.Scanner;

public class Problem4LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");
        int[] sequence = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            sequence[i] = Integer.parseInt(line[i]);
        }
        int counter = 1;
        int longSequence = 1;
        int lastElementPosition = 0;
        System.out.print(sequence[0] + " ");
        for (int i = 1; i < sequence.length ; i++) {
            if (sequence[i] > sequence[i - 1]){
                System.out.print(sequence[i] + " ");
                counter++;
            }else {
                counter = 1;
                System.out.println();
                System.out.print(sequence[i] + " ");
            }
            if (counter > longSequence){
                longSequence = counter;
                lastElementPosition = i;
            }
        }
        System.out.println();
        System.out.print("Longest: ");
        for (int i = lastElementPosition - longSequence + 1; i <= lastElementPosition ; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
