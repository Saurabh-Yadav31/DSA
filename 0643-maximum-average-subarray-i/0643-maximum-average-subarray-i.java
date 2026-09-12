class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return (double) maxSum / k;
    }
}