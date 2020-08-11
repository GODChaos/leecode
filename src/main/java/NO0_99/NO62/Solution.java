package NO0_99.NO62;


class Solution {
    public int uniquePaths(int m, int n) {
        if (m ==1 || n == 1) return 1;
        int[][] grid = new int[n][m];
        for (int i = 1; i < grid.length; i++) grid[i][0] = 1;
        for (int i = 1; i < grid[0].length; i++) grid[0][i] = 1;

        for (int i = 1; i < grid[0].length; i++) {
            for (int j = 1; j < grid.length; j++) {
                grid[j][i] = grid[j - 1][i] + grid[j][i - 1];
            }


        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}