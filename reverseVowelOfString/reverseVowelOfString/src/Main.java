import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("output: "+ reverseVowels("IceCreAm"));
    }
    public static String reverseVowels(String s) {
        String[] str = s.split("");
        String fWord ;
        String bWord ;
        String hold;
        String vowel="aeiouAEIOU";
                //{"a","e","i","o","u","A","E","I","O","U"};
        int len = s.length();
        int back=len-1;
        int front=0;
        while(front<back){
            fWord= str[front];
            bWord= str[back];
            if(vowel.contains(fWord)){
                if(vowel.contains(bWord)){
                    hold=fWord;
                    str[front]=bWord;
                    str[back]=hold;
                    front++;
                    back--;
                }else{
                    back--;
                }

            }else{
                front++;
            }
        }
        return String.join("", str);

    }
}

//time and space complexity: O(N)