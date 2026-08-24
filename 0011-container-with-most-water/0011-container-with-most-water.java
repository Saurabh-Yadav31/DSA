class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int area = width * currentHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
// Algorithm:
// 1. Initialize two pointers:
//      left = 0
//      right = nums.length - 1
// 2. Initialize maxArea = 0.
// 3. While left < right:
//      - Calculate width = right - left.
//      - Calculate height = min(height[left], height[right]).
//      - Calculate area = width * height.
//      - Update maxArea if the current area is greater.
//      - If height[left] < height[right], move left forward.
//      - Otherwise, move right backward.
// 4. Return maxArea.
// Time Complexity: O(n)
// Space Complexity: O(1)