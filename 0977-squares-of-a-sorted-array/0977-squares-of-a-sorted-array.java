class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index] = nums[left] * nums[left];
                left++;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return result;
    }
}
/*
Algorithm: Using two pointers approach
1. Create a result array of the same size.
2. Set left = 0 and right = n - 1.
3. Set position = n - 1.
4. While left <= right:
   - Compare abs(nums[left]) and abs(nums[right]).
   - If left value is larger:
       put nums[left]² at result[position]
       move left forward.
   - Otherwise:
       put nums[right]² at result[position]
       move right backward.
   - Move position backward.
5. Return result.
Time:  O(n)
Space: O(n)



/*
class Solution {
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }
}
1. Traverse the given sorted array.
2. Square every element of the array.
3. Sort the squared array.
4. Return the sorted array.
Time Complexity:
- Squaring elements → O(n)
- Sorting → O(n log n)
Overall → O(n log n)
Space Complexity:
- O(log n) approximately for the sorting operation
*/