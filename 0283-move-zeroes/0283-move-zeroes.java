class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
            j++;
        }
    }
}
// Algorithm:
// 1. Initialize two pointers i = 0 and j = 0.
// 2. Traverse the array using j.
// 3. If nums[j] is non-zero:
//      - Swap nums[i] and nums[j].
//      - Increment i.
// 4. Increment j after every iteration.
// 5. Continue until j reaches the end of the array.
// 6. Return the modified array.
//Time Complexity: O(n)
//Space Complexity: O(1)