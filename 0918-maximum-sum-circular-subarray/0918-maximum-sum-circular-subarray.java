class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int totalSum = 0;

        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            totalSum += nums[i];

            currentMax = Math.max(currentMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(currentMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        if (maxSum < 0) {
            return maxSum;
        }
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }
}

// Algorithm:
// 1. Find the maximum subarray sum using Kadane's Algorithm.
// 2. Find the total sum of the array.
// 3. Find the minimum subarray sum using the opposite Kadane's Algorithm.
// 4. If the maximum subarray sum is negative,
//    return it because all elements are negative.
// 5. Otherwise, calculate the circular sum as:
//    totalSum - minimumSubarraySum.
// 6. Return the maximum of:
//    - Normal Kadane answer
//    - Circular subarray answer