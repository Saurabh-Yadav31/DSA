class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
/* Algorithm: Using Two pointers Appraoch
1. Initialize two pointers:
   - left = 0
   - right = numbers.length - 1
2. While left < right:
   - Calculate:
     sum = numbers[left] + numbers[right]
3. If sum == target:
   - Return the 1-based indices:
     [left + 1, right + 1]
4. If sum < target:
   - We need a larger sum.
   - Move left forward:
     left++
5. If sum > target:
   - We need a smaller sum.
   - Move right backward:
     right--
6. The problem guarantees exactly one solution.
Time Complexity:  O(n)
Space Complexity: O(1)
*/