class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        // Put even numbers first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }
        // Put odd numbers after even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }
}
/*
1. Create a new array of the same size.
2. Traverse the original array.
3. First put all even numbers into the new array.
4. Traverse the original array again.
5. Put all odd numbers into the new array.
6. Copy the new array back to the original array.
7. Return the original array.
Time:  O(n)
Space: O(n)
*/