class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0;
        for (int j = 0; j < nums.length; j++) {

            int rightSum = totalSum - leftSum - nums[j];

            if (leftSum == rightSum) {
                return j;
            }
            leftSum += nums[j];
        }
        return -1;      
    }
}

// Algorithm:
// 1. Calculate the total sum of the array.
// 2. Initialize leftSum = 0.
// 3. Traverse the array.
// 4. Calculate rightSum as:
//    totalSum - leftSum - nums[i].
// 5. If leftSum == rightSum,
//    return the current index.
// 6. Update leftSum by adding nums[i].
// 7. If no pivot index is found,
//    return -1.