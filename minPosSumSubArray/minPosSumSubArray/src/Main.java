import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int minPositiveSum = Integer.MAX_VALUE;

        // Try all window sizes from l to r
        for (int windowSize = l; windowSize <= Math.min(r, n); windowSize++) {
            // Calculate sum of first window of current size
            int windowSum = 0;
            for (int i = 0; i < windowSize; i++) {
                windowSum += nums.get(i);
            }

            // Check if the first window has a positive sum
            if (windowSum > 0) {
                minPositiveSum = Math.min(minPositiveSum, windowSum);
            }

            // Slide the window for the current size
            for (int i = 0; i < n - windowSize; i++) {
                windowSum = windowSum - nums.get(i) + nums.get(i + windowSize);

                // Update minimum positive sum if found
                if (windowSum > 0) {
                    minPositiveSum = Math.min(minPositiveSum, windowSum);
                }
            }
        }

        // If no valid subarray found, return -1
        return minPositiveSum == Integer.MAX_VALUE ? -1 : minPositiveSum;

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> arr = new ArrayList<>();
       arr.add(-12);
        arr.add(8);

        System.out.println(arr);
        System.out.println(minimumSumSubarray(arr,1,1));

    }
}