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