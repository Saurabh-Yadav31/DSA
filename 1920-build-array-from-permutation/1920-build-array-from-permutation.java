class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length]; //By creating a answer array as a brute force approach

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

/*Optimized approach
class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;

        // Store both old and new values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }

        // Extract only the new values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }
}
*/