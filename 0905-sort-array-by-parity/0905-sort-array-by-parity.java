class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 != 0) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }
        return nums;
    }
}

/*
Algorithm: Two Pointers approach
1. Set i = 0 and j = nums.length - 1.
2. While i < j:
   a. If nums[i] is even:
      move i forward.
   b. If nums[j] is odd:
      move j backward.
   c. If nums[i] is odd AND nums[j] is even:
      swap nums[i] and nums[j].
      Move both pointers.
3. Return nums.
Time:  O(n)
Space: O(n)
*/



/*
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