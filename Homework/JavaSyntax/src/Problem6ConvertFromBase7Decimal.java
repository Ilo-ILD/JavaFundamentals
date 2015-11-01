import java.util.Scanner;

public class Problem6ConvertFromBase7Decimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] array = line.toCharArray();
        int i = 0;
        int summ = 0;

        for (int y = array.length -1; y >= 0; y--) {
            summ += Character.getNumericValue(array[y]) * Math.pow(7, i++);

        }

        System.out.println(Integer.toString(summ));
    }
}
