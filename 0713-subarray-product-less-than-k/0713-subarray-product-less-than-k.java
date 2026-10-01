class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
/*
1. If k <= 1, return 0 because all numbers are positive.
2. Initialize left = 0, product = 1, and count = 0.
3. Move right through the array and multiply nums[right] with product.
4. If product >= k, shrink the window from the left:
   - Divide product by nums[left].
   - Move left forward.
5. Once product < k, the current window is valid.
6. Add right - left + 1 to count because this represents all valid subarrays ending at right.
7. Continue until the entire array is processed.
8. Return count.
Complexity
Time Complexity: O(n)
Space Complexity: O(1)
*/