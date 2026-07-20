class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;

        ArrayList<Integer> list = new ArrayList<>();

        // Convert 2D grid to 1D list
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                list.add(grid[i][j]);
            }
        }

        int total = list.size();

        ArrayList<Integer> shifted =
                new ArrayList<>(Collections.nCopies(total, 0));

        // Shift elements
        for (int i = 0; i < total; i++) {

            int newIndex = (i + k) % total;

            shifted.set(newIndex, list.get(i));
        }

        // Convert back to 2D List
        List<List<Integer>> ans = new ArrayList<>();

        int index = 0;

        for (int i = 0; i < rows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {

                row.add(shifted.get(index));
                index++;
            }
            ans.add(row);
        }
        return ans;
    }
}