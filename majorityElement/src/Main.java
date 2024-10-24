import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums={3,1,3};
        System.out.println("hello: "+ majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {

        int moreThan = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
           if(map.get(nums[i])> moreThan){
              return nums[i];
           }
        }
        return 0;
    }
}