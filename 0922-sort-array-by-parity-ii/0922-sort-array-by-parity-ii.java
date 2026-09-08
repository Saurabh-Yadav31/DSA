class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;  // even index
        int j = 1;  // odd index
        while (i < nums.length && j < nums.length) {
            if (nums[i] % 2 != 0) {
                while (j < nums.length && nums[j] % 2 != 0) {
                    j += 2;
                }
                if (j < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            i += 2;
        }
        return nums;
    }
}

/*Algorithm: Two pointers
1. Initialize i = 0 for even indices.
2. Initialize j = 1 for odd indices.
3. While i and j are within the array:
   a. Move i by 2 while nums[i] is even.
      These values are already correctly placed.
   b. Move j by 2 while nums[j] is odd.
      These values are already correctly placed.
   c. Now nums[i] is an odd number at an even index,
      and nums[j] is an even number at an odd index.
   d. Swap nums[i] and nums[j].
4. Continue until all positions are correctly placed.
5. Return nums.
Time Complexity:  O(n)
Space Complexity: O(1)
*/