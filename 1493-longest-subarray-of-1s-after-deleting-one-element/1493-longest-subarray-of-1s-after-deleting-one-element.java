class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}
/* Algorithm: Variable Sliding window
1.Initialize left = 0, zeroCount = 0, and maxLength = 0.
2.Traverse the array using right.
3.If nums[right] == 0, increment zeroCount.
4.If zeroCount > 1, shrink the window from the left:
4(a).If nums[left] == 0, decrement zeroCount.
4(b).Move left forward.
5.Update maxLength using right - left because one element must be deleted.
6.Continue until right reaches the end of the array.
7.Return maxLength.

Time Complexity: O(n)
Space Complexity: O(1)
*/