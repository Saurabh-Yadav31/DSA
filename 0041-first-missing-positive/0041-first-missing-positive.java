class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int correctIndex = nums[i] - 1;

            // Swap only if:
            // 1. Number is positive
            // 2. Number is within the array range
            // 3. It is not already in its correct position
            if (nums[i] > 0 &&
                nums[i] <= n &&
                nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            } else {
                i++;
            }
        }
        // Find the first index where the value is incorrect
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}