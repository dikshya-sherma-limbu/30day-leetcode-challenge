import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0; i<candies.length;i++){
            candies[i]+=extraCandies;
            if(!(candies[i] >=max)){
             result.add(false);
                System.out.println(result);
            }else{
                result.add(true);
            }
        }
        return result;
    }
    //time and space complexity: O(N)
}