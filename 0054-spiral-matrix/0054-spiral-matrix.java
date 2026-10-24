class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // Traverse top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            // Traverse right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // Traverse bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
/*
Algorithm
1. Initialize four boundaries: top = 0, bottom = m - 1, left = 0, and right = n - 1.
2. While top <= bottom and left <= right:
   - Traverse the top row from left to right, then increment top.
   - Traverse the right column from top to bottom, then decrement right.
   - If top <= bottom, traverse the bottom row from right to left, then decrement bottom.
   - If left <= right, traverse the left column from bottom to top, then increment left.
3. Repeat until all boundaries cross.
4. Return the result list containing the elements in spiral order.

- Time Complexity: O(m* n) — each matrix element is visited exactly once.
- Auxiliary Space Complexity: O(1) — only four boundary variables are used, excluding the output list.
- Output Space Complexity: O(m*n) — the result list stores all matrix elements.
*/