class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows * cols;
        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                int newIndex = (index + k) % total;
                int newRow = newIndex / cols;
                int newCol = newIndex % cols;
                ans[newRow][newCol] = grid[i][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                temp.add(ans[i][j]);
            }
            res.add(temp);
        }
        return res;
    }
}