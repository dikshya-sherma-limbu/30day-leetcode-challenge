import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("jam", "jar"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sCount = new HashMap<>();
        HashMap<Character,Integer> tCount = new HashMap<>();

        // checks if the length of the both string is equal or not
        if (s.length() != t.length()){
            return false;
        }

        // adding the key as character from the given string in (t & s)
        // adding value are per the no of the character occurrence in the given string
        //sCount.getOrDefault(s.charAt(i),0)+1 :
        // gets the value of the given s.charAt(i) , if there's no value then add default value 0 = as a value in sCount
        // if there's the value then , +1 as we are counting the character occurrence .
        for(int i=0; i <s.length() ; i++ ){
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i),0)+1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i),0)+1);
        }
        // returns true if the both keys and values are same in both the hashmap.
        return sCount.equals(tCount);
    }

    // time complexity: o(n)
    // space complexity : o(1) - due to the limited lowercase character[26]. the space complexity won't exceed 26 so, the space remain constant.
}