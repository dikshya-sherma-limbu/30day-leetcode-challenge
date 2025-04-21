class Main {
    static int maxSum(int arr[], int n, int k) {
        // Calculate sum of first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Initialize max_sum with first window's sum
        int maxSum = windowSum;

        // Slide the window from left to right
        for (int i = 0; i < n - k; i++) {
            // Remove the leftmost element of previous window
            // Add the rightmost element of current window
            windowSum = windowSum - arr[i] + arr[i + k];

            // Update maxSum if required
            maxSum = Math.max(windowSum, maxSum);
            System.out.println("update sum: " + maxSum);
        }

        return maxSum;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3 };
        int k = 2;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}