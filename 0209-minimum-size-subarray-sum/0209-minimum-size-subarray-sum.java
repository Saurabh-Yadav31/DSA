class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
/* Algorithm: Variable Sliding Window
Initialize left = 0, sum = 0, and minLength = infinity.
Traverse the array using right from 0 to n - 1.
Add nums[right] to sum.
While sum >= target:
Update minLength with the current window length.
Remove nums[left] from sum.
Move left one position forward.
Continue until the entire array is traversed.
If no valid subarray was found, return 0; otherwise, return minLength.

Time Complexity: O(n)
Space Complexity: O(1)
*/