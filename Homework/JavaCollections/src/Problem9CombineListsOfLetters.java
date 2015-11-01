//Write a program that reads two lists of letters l1 and l2 and combines them: appends all
//        letters c from l2 to the end of l1, but only when c does not appear in l1. Print the
//        obtained combined list. All lists are given as sequence of letters separated by a single
//        space, each at a separate line. Use ArrayList<Character> of chars to keep the input and
//        output lists. Examples:
//        h e l l o       //        l o w	h e l l o w

import java.util.Scanner;

public class Problem9CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] stringOne = in.nextLine().toCharArray();
        char[] stringTwo = in.nextLine().toCharArray();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < stringOne.length; i++) {
            temp.append(stringOne[i]);
        }
        for (int i = 0; i < stringTwo.length; i++) {
            if (temp.indexOf(String.valueOf(stringTwo[i])) == - 1){
                result.append(" ").append(stringTwo[i]);
            }
        }
        String finale = temp.toString() + result.toString();
        System.out.println(finale);
    }
}
