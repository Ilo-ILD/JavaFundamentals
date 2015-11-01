
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem13GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] console = in.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < console.length; i++) {
            int number = Integer.parseInt(console[i]);
            list.add(number);
        }
        String[] nextLine = in.nextLine().split(" ");
        String oddOrEvevn = nextLine[2];
        if (oddOrEvevn.equals("even")){
            for (int x : list) {
                if (x % 2 == 0){
                    System.out.println(x);
                }
            }
        }else {
            for (int x : list) {
                if (x % 2 == 1){
                    System.out.println(x);
                }
            }
        }

    }
}