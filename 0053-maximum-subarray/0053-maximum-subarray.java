class Solution {
    public int maxSubArray(int[] nums) {

        // Step 1: Initialize current and maximum sum
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Step 2: Traverse the array from the second element
        for (int i = 1; i < nums.length; i++) {

            // Step 3: Decide whether to continue the current subarray
            // or start a new subarray from the current element
            currentSum = Math.max(currentSum + nums[i], nums[i]);

            // Step 4: Update the maximum sum if needed
            maxSum = Math.max(maxSum, currentSum);
        }

        // Step 5: Return the maximum subarray sum
        return maxSum;
    }
}