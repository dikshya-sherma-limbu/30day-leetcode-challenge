import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("output"+ mergeAlternately("abcd","pq"));
    }
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        if(word1.length()>=word2.length()){
            int j=0;
            System.out.println("if word 1 greater");
            for(int i=0;i<word1.length();i++){
               result.append(word1.charAt(i));
               if(j<word2.length()) {
                 result.append(word2.charAt(j));
                   j++;
               }
            }

        }else{
            int j=0;
            System.out.println("if word2 greater");
            for(int i=0;i<word2.length();i++){

                if(j<word1.length()) {
                    result.append(word1.charAt(j));
                    j++;
                }
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
//        StringBuilder result= new StringBuilder();
//        int w1=0;
//        int w2=0;
//        while(w1<word1.length() && w2<word2.length()){
//            result.append(word1.charAt(w1));
//            result.append(word2.charAt(w2));
//            w1++;
//            w2++;
//        }
//        for(;w1<word1.length() && w1 >=word2.length();){
//            result.append(word1.charAt(w1));
//            w1++;
//
//        }
//        for(;w2<word2.length() && w2 >=word1.length(); w2++){
//            result.append(word2.charAt(w2));
//        }
//        return result.toString();

        // time and space complexity: O(n+m)
        //This means the time and space required by your algorithm will grow linearly with the combined lengths of word1 and word2.
        //both code serves the same functionality
    }
}