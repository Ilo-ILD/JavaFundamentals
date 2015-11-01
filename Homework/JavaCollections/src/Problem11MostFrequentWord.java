//Write a program to find the most frequent word in a text and print it, as well as how many times it appears
//        in format "word -> count". Consider any non-letter character as a word separator. Ignore the character casing.
//        If several words have the same maximal frequency, print all of them in alphabetical order. Examples:
//
//        in the middle of the night          //the -> 2 times


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11MostFrequentWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String words = in.nextLine();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(words.toLowerCase());
        List<String> allMatches = new ArrayList<>();

        SortedMap<String, Integer> hash = new TreeMap<>() ; //sudavame rechnik

        int count = 0;
        int maxCount = 0;
        
        while (matcher.find()) {
            if (!hash.containsKey(matcher.group())){
                hash.put(matcher.group(), 1);
            }else {
                count = hash.get(matcher.group());
                hash.remove(matcher.group());
                hash.put(matcher.group(), count + 1);
            }
            allMatches.add(matcher.group());
        }
        for (int i = 0; i < allMatches.size(); i++) {         // tuk prosto vzemam nai-goelmiq int ot rechnika
            if (hash.get(allMatches.get(i)) > maxCount) {
                maxCount = hash.get(allMatches.get(i));
            }
        }
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value == maxCount){
                System.out.printf("%s -> %d times\n", key, value);
            }
        }

    }
}
