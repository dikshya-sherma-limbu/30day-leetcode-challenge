import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numbers={2,3,1,4};
        System.out.println("output: "+ containsDuplicate(numbers));

    }
    public static boolean containsDuplicate(int[] nums) {
        
        boolean result = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        int defval = 1;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],defval);
            }else{
                map.put(nums[i], ++defval);
            }
            if(map.get(nums[i])>1){
                System.out.println("case of true");
                result= true;
            }else {
                result= false;
            }
        }

        return result;
        //time and space complexity: O(N)

    }

}