class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; // nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}

/*
we can solve it by creating a new output array
int[] ans = new int[nums.length];
int sum = 0;

for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
    ans[i] = sum;
}

return ans;
*/