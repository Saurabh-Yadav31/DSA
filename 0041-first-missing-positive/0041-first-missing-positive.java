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

/* Other two initial solution which I dervied
Algorithm:
// 1. Start with target = 1.
// 2. Traverse the entire array to check whether target exists.
// 3. If found, increment target by 1.
// 4. Again traverse the entire array for the new target.
// 5. Repeat until a target is not found.
// 6. Return that target as the first missing positive.

class Solution {
    public int firstMissingPositive(int[] nums) {

        int target = 1;
        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == target) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return target;
            }
            target++;
        }
    }
}

Complexity
Time: O(n²)
Space: O(1)
---------------------------------------------------------

2. Algorithm
// 1. Sort the array.
// 2. Initialize target = 1.
// 3. Traverse the sorted array.
// 4. Ignore negative numbers and zero.
// 5. Ignore duplicate numbers.
// 6. If current number equals target,
//    increment target.
// 7. If current number is greater than target,
//    target is the first missing positive.
// 8. Return target.

import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int target = 1;

        for (int num : nums) {

            if (num <= 0) {
                continue;
            }
            if (num == target) {
                target++;
            }
            else if (num > target) {
                return target;
            }
        }
        return target;
    }
}

Complexity
Time: O(n log n)
Space: O(1) (ignoring the internal stack space used by Java's sort)
*/

