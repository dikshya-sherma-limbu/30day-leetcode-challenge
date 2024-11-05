import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("output: "+ isSubsequence("","abfdgc"));
    }

    public static boolean isSubsequence(String s, String t) {
        System.out.println(s.length());
        char[] tChar=  t.toCharArray();
        char[] sChar = s.toCharArray();
        char[] hold = new char[s.length()];
        int pointer1=s.length()-1;
        int pointer2=t.length()-1;
        while(pointer2>=0 && pointer1>=0){
            if(sChar[pointer1]==tChar[pointer2]){
                hold[pointer1]=sChar[pointer1];
                pointer1--;
                pointer2--;
            }else{
                pointer2--;
            }
        }

        return Arrays.equals(hold,sChar);
    }
}