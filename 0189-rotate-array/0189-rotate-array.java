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

/* other two solution which can be used
1. Repeated rotation
class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        for (int i = 0; i < k; i++) {

            int last = nums[n - 1];

            // Shift elements to the right
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = last;
        }
    }
}


2. using temporary array and shifting
class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
*/