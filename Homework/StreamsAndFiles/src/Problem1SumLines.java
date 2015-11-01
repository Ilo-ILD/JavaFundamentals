import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem1SumLines {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src/fileTest.txt"))
        ){
        while (true) {
            String line = fileReader.readLine();
            if (line == null) break;
            char[] chars = line.toCharArray();
            int summ = 0;
            for (int i = 0; i < chars.length; i++) {
                summ += chars[i];
            }
            System.out.println(summ);
        }
            } catch (IOException e) {
                System.err.println("Cannot read the file");
            }
        }
    }
