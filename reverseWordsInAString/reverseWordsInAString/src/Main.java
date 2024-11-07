import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("output: " + reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        char[] st=s.toCharArray();
        int left=0;
        for(int right=0;right<st.length;right++)
        {

            if(st[right]==' ' || right==st.length-1){
                int temp_left = left;
                int temp_right=right-1;
                if(right==st.length-1){
                    temp_right=right;
                }
                while(temp_left<temp_right){
                    char hold=st[temp_left];
                    st[temp_left]=st[temp_right];
                    st[temp_right]=hold;

                    temp_left++;
                    temp_right--;
                }
                left=right+1;

            }
        }
        return new String(st);
    }
}