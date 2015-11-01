import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem3CountCharacterTypes {
    public static void main(String[] args) {
        try (
                FileReader fileReader = new FileReader("src/words.txt");
                FileWriter fw = new FileWriter("src/count0-chars.txt")
        ){
            int i;
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            while ((i = fileReader.read()) != - 1) {
                if (((char)i == 'a') || ((char)i == 'e')|| ((char)i == 'i')|| ((char)i == 'o')|| ((char)i == 'u')){
                    vowels++;
                }
                else if (((char)i == '.') || ((char)i == ',') || ((char)i == '!') || ((char)i == '?')){
                   punctuation++;
                }
                else if (i != 32){
                    consonants++;
                }
            }
            fw.write("Vowels: " + Integer.toString(vowels) + "\n");
            fw.write("Consonants: " + Integer.toString(consonants) + "\n");
            fw.write("Punctuation: " + Integer.toString(punctuation) + "\n");
        }
        catch (IOException e) {
            System.err.println("Cannot read the file");
        }
    }
}
