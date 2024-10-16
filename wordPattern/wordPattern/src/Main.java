import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("result: "+wordPattern("aaa","top dop dop top")
        ) ;
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap <Character , String> map = new HashMap<>();
        String [] split = s.split(" ");
        if(pattern.length() !=split.length){
            return false;
        }
        for(int i=0; i<split.length;i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(!map.containsValue(split[i])){
                    map.put(pattern.charAt(i), split[i]);
                }else {
                    return false;
                }
            }else{
                if(!Objects.equals(map.get(pattern.charAt(i)), split[i])){
                    return false;
                }
            }

        }
        return true;

        // Space and Time complexity: O(N
    }
}