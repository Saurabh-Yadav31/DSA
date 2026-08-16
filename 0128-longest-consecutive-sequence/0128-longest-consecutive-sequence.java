/*
class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}

Algorithm —(Sorting Approach)
If the array is empty, return 0.
Sort the given array.
Initialize currentLength = 1 and maxLength = 1.
Traverse the array from the second element.
If the current element is equal to the previous element, skip it.
If the current element is exactly one greater than the previous element, increment currentLength.
Otherwise, reset currentLength to 1.
Update maxLength with the maximum of maxLength and currentLength.
Return maxLength.
Complexity
Time: O(n log n)
Space: O(1) auxiliary space
*/

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to HashSet
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        // Check every number
        for (int num : set) {

            // Start only if num is the first number
            if (!set.contains(num - 1)) {

                int current = num;
                int currentLength = 1;

                // Find consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    currentLength++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}