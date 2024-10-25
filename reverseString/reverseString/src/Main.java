import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char[] s= {'H','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[]s) {
        int len = s.length;
        int back=len-1;
        int front=0;
        char hold;
        while (front<back){
            hold= s[front];
            s[front]=s[back];
            s[back]=hold;
            System.out.println("f"+s[front]);
            System.out.println("b"+s[back]);
            back--;
            front ++;



        }
        System.out.println("output: "+ Arrays.toString(s));
    }
}