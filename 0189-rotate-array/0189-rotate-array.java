class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n; // finding the ampunt of rotation actually required

        reverse(nums, 0, n - 1); //complete reverse

        reverse(nums, 0, k - 1); // first part till k value

        reverse(nums, k, n - 1); // remaining till n-1
    }

    private void reverse(int[] nums, int left, int right) { // helper fuction to reverse

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}