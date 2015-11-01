import java.util.Scanner;

public class Problem12CharacterMultiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(" ");
        char[] first = line[0].toCharArray();
        char[] second = line[1].toCharArray();
        int totalSumm = 0;
        int i = 0;

        for (i = 0; i < Math.min(first.length, second.length); i++) {
            totalSumm += first[i] * second[i];
        }
        if (first.length > second.length){
            for (int y = i; y < first.length; y++) {
                totalSumm += first[y];
            }
        }else if (second.length > first.length) {
            for (int j = i; j < second.length; j++) {
                totalSumm += second[j];
            }
        }
        System.out.println(totalSumm);
    }
}
