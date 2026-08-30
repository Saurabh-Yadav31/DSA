class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int i = 0;

        while (count0 > 0) {
            nums[i] = 0;
            i++;
            count0--;
        }
        while (count1 > 0) {
            nums[i] = 1;
            i++;
            count1--;
        }
        while (count2 > 0) {
            nums[i] = 2;
            i++;
            count2--;
        }
    }
}
// Algorithm:
// 1. Initialize three counters: count0, count1, and count2.
// 2. Traverse the array and count the number of 0s, 1s, and 2s.
// 3. Start from index 0.
// 4. Fill the array with 0 until count0 becomes 0.
// 5. Continue filling the array with 1 until count1 becomes 0.
// 6. Continue filling the remaining positions with 2 until count2 becomes 0.
// 7. The array is now sorted.

// Time Complexity: O(n)
// Space Complexity: O(1)