import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int target = 10;
        int[] nums = {4,5,6};

        System.out.printf("Target: "+ (Arrays.toString(twoSum(nums, target))));

    }

    public static int[] twoSum(int[] nums, int target) {
        // Brute Force Method : Time Complexity - O(n^2) || Space complexity - O(1)
//        int i=0;
//        int j=nums.length-1;
//        for( ;i<nums.length;i++){
//            for(;j>i;j--){
//                if(nums[i]+nums[j] ==target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//       return null;

        // Hash Table Method
        HashMap<Integer,Integer> twoSum= new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int currentElement =  nums[i];
            int elementToFind = target - currentElement;
            if(twoSum.containsKey(elementToFind)){
                return new int[]{twoSum.get(elementToFind), i};
            }
            twoSum.put(nums[i],i);
        }
        return null;
//        // Time Complexity : O(n)  || Space Complexity : O(n)
    }
}