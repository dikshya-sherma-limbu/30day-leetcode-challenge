import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] num1={4,9,5}; //4,9,5
        int[] num2 ={9,4,9,8,4};   //
        System.out.println("output: "+ Arrays.toString(intersection(num1, num2)));
    }
    public static int[] intersection(int[]num1, int[]num2){
        HashMap<Integer , Integer> mapNum1 = new HashMap<>();
        ArrayList<Integer> listing = new ArrayList<>();

        for(int num : num1){
            mapNum1.put(num, mapNum1.getOrDefault(num,0)+1);

        }
        for(int num: num2){
            if(mapNum1.containsKey(num) && mapNum1.get(num)>0){
                listing.add(num);
                mapNum1.put(num, mapNum1.get(num)-1);
            }
        }
        int[] result= new int[listing.size()];
        for(int i=0;i<listing.size();i++){
            result[i]=listing.get(i);
        }
        return  result;
    }
}