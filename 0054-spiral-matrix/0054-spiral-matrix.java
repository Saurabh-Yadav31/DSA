import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int row = 0, col = 0, direction = 0;
        for (int i = 0; i < m * n; i++) {
            result.add(matrix[row][col]);
            visited[row][col] = true;

            int nextRow = row + dr[direction];
            int nextCol = col + dc[direction];

            if (nextRow < 0 || nextRow >= m ||
                nextCol < 0 || nextCol >= n ||
                visited[nextRow][nextCol]) {
                direction = (direction + 1) % 4;
            }
            row += dr[direction];
            col += dc[direction];
        }
        return result;
    }
}