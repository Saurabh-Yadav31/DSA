class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2: Reverse each row using two pointers
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}
/*
Algorithm
1. Get the size of the square matrix, n.
2. Transpose the matrix:
   - Iterate through each row using i.
   - Iterate through columns using j = i + 1 to avoid swapping elements twice.
   - Swap matrix[i][j] with matrix[j][i].
3. Reverse each row:
   - Initialize two pointers, left = 0 and right = n - 1.
   - Swap the elements at these positions while left < right.
   - Increment left and decrement right.
4. The matrix is now rotated 90° clockwise in place.

Complexity
- Time Complexity: O(n^2) — transposing and reversing all rows take quadratic time.
- Auxiliary Space Complexity: O(1) — the operation modifies the original matrix using only a temporary variable and pointers.
*/