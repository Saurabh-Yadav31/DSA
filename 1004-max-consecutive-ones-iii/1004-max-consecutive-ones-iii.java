class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
/*Algorithm: Using Sliding Window
1.Initialize left = 0, zeroCount = 0, and maxLength = 0.
2.Traverse the array using right from 0 to n - 1.
3.If nums[right] == 0, increment zeroCount.
4.If zeroCount > k, shrink the window from the left:
4(a)If nums[left] == 0, decrement zeroCount.
4(b)Move left forward.
5.Calculate the current window length as right - left + 1.
6.Update maxLength with the maximum window length.
7.Return maxLength.
Time Complexity: O(n)
Space Complexity: O(1)
*/
