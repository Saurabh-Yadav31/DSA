class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] <= height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
/* Algorithm: Using two pointers aproach
1. Initialize two pointers:
   left = 0
   right = n - 1
2. Initialize the maximum boundary seen from each side:
   leftMax = 0
   rightMax = 0
3. Initialize:
   water = 0
4. While left < right:
   a. If height[left] <= height[right]:
      - If height[left] >= leftMax:
          update leftMax = height[left]
      - Otherwise:
          water += leftMax - height[left]
      - Move left forward.

   b. Otherwise:
      - If height[right] >= rightMax:
          update rightMax = height[right]
      - Otherwise:
          water += rightMax - height[right]
      - Move right backward.
5. Return water.
Time Complexity:  O(n)
Space Complexity: O(1)
*/