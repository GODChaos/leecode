package NO1201_1299.NO1266;


class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int l = points.length;
        int c = 0;
        for (int i = 0; i < l - 1; i++) {
            int a = Math.abs(points[i + 1][0] - points[i][0]);
            int b = Math.abs(points[i + 1][1] - points[i][1]);
            c += (a + b - Math.min(a, b));
        }return c;
    }
}