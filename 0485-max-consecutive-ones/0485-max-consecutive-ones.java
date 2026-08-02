class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount; 
    }
}

// Algorithm:
// 1. Initialize currentCount = 0 and maxCount = 0.
// 2. Traverse the array.
// 3. If the current element is 1,
//    increase currentCount by 1.
// 4. Update maxCount if currentCount is greater.
// 5. If the current element is 0,
//    the consecutive sequence breaks,
//    so reset currentCount to 0.
// 6. After traversing the array,
//    return maxCount.