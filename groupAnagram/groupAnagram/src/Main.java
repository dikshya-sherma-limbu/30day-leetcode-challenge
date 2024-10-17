import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[]{"cat", "dog", "act", "hen", "god"};

        System.out.println("output: " + groupAnagram(input));
    }

    public static List<List<String>> groupAnagram(String[] str) {

        HashMap<String, List<String>> map = new HashMap<>();


        for (int i = 0; i < str.length; i++) {
            //convert the str in i into char
            char[] intoChar = str[i].toCharArray();
            //then sort
            // uses Dual-Pivot Quick Sort
            Arrays.sort(intoChar);
            //then again, convert back to the word
            String sortedWord = new String(intoChar);
            // if the word is new , meaning map does not contain
            //then initialize the arraylist for that key -word
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            //finally, add the str[i] word in the map with the sorted word
            map.get(sortedWord).add(str[i]);
        }
        return new ArrayList<>(map.values());
        /*
        Time Complexity: O( n* k log k)
        Space complexity: n * k
        where n is the number of string and k is the length of string

        * */
    }

}