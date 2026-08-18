class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {
                    continue;
                }
                char num = board[row][col];

                int box = (row / 3) * 3 + (col / 3);

                if (rows[row].contains(num) ||
                    columns[col].contains(num) ||
                    boxes[box].contains(num)) {

                    return false;
                }
                rows[row].add(num);
                columns[col].add(num);
                boxes[box].add(num);
            }
        }
        return true;
    }
}
        

// Algorithm:
// 1. Create 9 HashSets for rows, 9 HashSets for columns,
//    and 9 HashSets for the 3x3 boxes.
// 2. Traverse every cell of the Sudoku board.
// 3. If the cell contains '.', skip it.
// 4. Calculate the box number using:
//      box = (row / 3) * 3 + (col / 3)
// 5. Check if the current number already exists in the
//    corresponding row, column, or 3x3 box.
// 6. If it exists in any of them, return false.
// 7. Otherwise, add the number to the row, column,
//    and box sets.
// 8. After checking all cells, return true.

//Since Sudoku is always 9 × 9:
//Time: O(81) → effectively O(1)
//Space: O(81) → effectively O(1)