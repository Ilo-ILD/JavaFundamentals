import java.io.*;

public class Problem2AllCapitals {
    public static void main(String[] args) {
        try (
                FileReader fileReader = new FileReader("src/fileTest.txt");
                FileWriter fw = new FileWriter("src/fileTest_out.txt")
        ){
            int i;
            String result = "";
            while ((i = fileReader.read()) != - 1) {
                result += (char)i;
                fw.write(result.toUpperCase());
                result = "";
            }
        }
        catch (IOException e) {
            System.err.println("Cannot read the file");
        }
    }
}
