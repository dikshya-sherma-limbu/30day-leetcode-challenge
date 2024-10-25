import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = {0,3,0,1,2};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int j = 1;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i " + i);
            System.out.println(j);
            if (nums[i] == 0 && j < nums.length) {
                res = nums[i];
                while (nums[j] == 0 && j != nums.length - 1) {
                    j += 1;
                }
                nums[i] = nums[j];
                nums[j] = res;
            }else{
                j+=1;
            }

            System.out.println("num: " + nums[i]);
        }
        System.out.println(Arrays.toString(nums));
    }
    // time complexity: O(N)
    // space complexity: 0(1)

}
