import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.printf("output: "+ romanToInt("III"));
    }
    public static int romanToInt(String s){

        HashMap<Character,Integer> keys= new HashMap<>();
        keys.put('I',1);
        keys.put('V',5);
        keys.put('X',10);
        keys.put('L',50);
        keys.put('C',100);
        keys.put('D',500);
        keys.put('M',1000);
        int output=0;
        int i=s.length()-1;
        while (i>=0){
            int current = keys.get(s.charAt(i));
            System.out.println("current: "+ current);
            if(i>0){
                int previous = keys.get(s.charAt(i-1));
                System.out.println("previous: "+ previous);
                if(previous<current){
                    output+=current-previous;
                    System.out.println("output if previous<current : "+ output);
                    i=i-2;
                }else{
                    output +=current;
                    i--;
                }
            }else{
                output+=current;
                i--;
            }
            System.out.println("output from outside: "+ output);
        }

        return output;
    }
}