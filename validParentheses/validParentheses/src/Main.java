import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("output: "+ isValid("([]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if( i!=s.length()-1 && (s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i)=='[')){
                stack.push((s.charAt(i)));
                System.out.println(s.charAt(i));

            } else if (!stack.isEmpty() && (stack.peek() =='(' && s.charAt(i)== ')' || stack.peek() =='{' && s.charAt(i)== '}' || stack.peek() =='[' && s.charAt(i)==']')) {
                stack.pop();

            }else{
                return false;
            }
        }

        return stack.isEmpty();
    }
}