import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverseStr("abcdefg",2));
    }

    public static String reverseStr(String s, int k) {
        char[] sArray= s.toCharArray();
        int len = s.length();
        for(int i=0;i<len;i+= 2*k){
            int end = Math.min(i+k-1,len-1);
            reverse(sArray, i,end);
        }

         return new String(sArray);
    }
    public static void reverse(char[] arrays, int start, int end){
        while(start<end){
           char temp= arrays[start];
           arrays[start++]=arrays[end];
           arrays[end--]=temp;
        }

    }
}