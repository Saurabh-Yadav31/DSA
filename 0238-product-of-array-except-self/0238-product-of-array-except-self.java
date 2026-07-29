class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

    int[] answer = new int[n];

    answer[0] = 1;

    // Left products
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }

    int rightProduct = 1;
    // Multiply with right products
    for (int i = n - 1; i >= 0; i--) {
        answer[i] = answer[i] * rightProduct;
        rightProduct *= nums[i];
    }
    return answer;
    }
}

// Algorithm for revision:
// 1. Create an answer array.
// 2. Store the product of all elements to the LEFT of each index in answer[].
//    - answer[0] = 1 because there are no elements to the left.
// 3. Traverse from right to left while maintaining rightProduct.
//    - Initially rightProduct = 1 because there are no elements to the right of the last index.
// 4. For each index:
//    - Multiply answer[i] with rightProduct.
//    - Update rightProduct by multiplying it with nums[i].
// 5. Return answer[].