package NO0_99.NO64;


class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 1; i < grid[0].length; i++) grid[0][i] += grid[0][i - 1];
        for (int i = 1; i < grid.length; i++) grid[i][0] += grid[i - 1][0];
        for (int i = 1; i < grid[0].length; i++) {
            for (int j = 1; j < grid.length; j++) {
                grid[j][i] += Math.min(grid[j - 1][i], grid[j][i - 1]);
            }


        }
        return grid[grid.length-1][grid[0].length-1];
    }
}