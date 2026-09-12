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
/* Algorithm :+ Using Sliding Window
1. Take a window of size k.
2. Calculate the sum of the first k elements.
3. Store this sum as the current maximum sum.
4. Move the window one position at a time:
   - Subtract the element leaving the window.
   - Add the new element entering the window.
5. After each movement, compare the new window sum with maxSum.
6. Update maxSum if the new sum is larger.
7. After checking all windows, divide maxSum by k.
8. Return the maximum average.
Time Complexity:  O(n)
Space Complexity: O(1)
*/