import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem4CopyJpgFile {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("src/Test.jpg");
                FileOutputStream fos = new FileOutputStream("src/Test_out.jpg")
        ){
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
