//Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
//        If several sequences have the same longest length, print the leftmost of them. The input strings
//        are given as a single line, separated by a space. Examples:
//        hi yes yes yes bye              yes yes yes

import java.util.Scanner;

public class Problem3LargestSequenceEqualStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] sequence = in.nextLine().split(" ");
        int counter = 1;
        int longSequence = 1;
        int lastElementPosition = 0;
        for (int i = 1; i < sequence.length ; i++) {
            if (sequence[i].contains(sequence[i - 1])){
                counter++;
            }else {
                counter = 1;
            }
            if (counter > longSequence){
                longSequence = counter;
                lastElementPosition = i;
            }
        }
        for (int i = lastElementPosition - longSequence + 1; i <= lastElementPosition ; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
