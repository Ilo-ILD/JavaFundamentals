import java.io.*;
import java.util.ArrayList;

public class Problem5SaveArrayListDoubles {
    public static void main(String[] args) {
        try (ObjectInputStream fis = new ObjectInputStream(
                (new BufferedInputStream(new FileInputStream("src/doubles.txt"))));
             ObjectOutputStream fos = new ObjectOutputStream(
                (new BufferedOutputStream(new FileOutputStream("src/doubles.list"))))
        ){
            ArrayList list = new ArrayList<Double>();
            int i;
            double temp;
            while ((i = fis.read()) != - 1) {
                temp = i;
                list.add(temp);
                fos.writeObject(list);
                temp = 0.0;
            }

        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
    }
