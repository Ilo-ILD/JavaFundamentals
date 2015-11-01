import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3ShmoogleCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Pattern pattern = Pattern.compile("\\b(double|int)\\s([a-z][a-zA-z]*)");
        List<String> listInts = new ArrayList<>();
        List<String> listDouble = new ArrayList<>();

        while (!line.equals("//END_OF_CODE")){
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                if (matcher.group(1).equals("int")) {
                    listInts.add(matcher.group(2));
                }else {
                    listDouble.add(matcher.group(2));
                }
            }
            line = in.nextLine();
        }
        Collections.sort(listInts);
        Collections.sort(listDouble);

        System.out.println(listDouble.size() <= 0 ? "Doubles: None" : new String("Doubles: " +  String .join(", ", listDouble)));
        System.out.println(listInts.size() <= 0 ? "Ints: None"  : new String("Ints: " +  String .join(", ", listInts)));
    }
}
