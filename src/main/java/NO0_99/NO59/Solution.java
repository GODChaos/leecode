package NO0_99.NO59;

class Solution {
    public int[][] generateMatrix(int n) {
        int direction = 1;
        int[] coordinate = {0, 0};
        int turn = 1;
        int[][] array = new int[n][n];
        for (int num = 1; num < n * n + 1; num++) {
            array[coordinate[0]][coordinate[1]] = num;
            switch (direction) {
                case 1:
                    if (coordinate[1] < n - turn) coordinate[1]++;
                    else {
                        direction = 2;
                        coordinate[0]++;
                    }
                    break;
                case 2:
                    if (coordinate[0] < n - turn) coordinate[0]++;
                    else {
                        direction = 3;
                        coordinate[1]--;
                    }
                    break;
                case 3:
                    if (coordinate[1] > turn - 1) coordinate[1]--;
                    else {
                        direction = 4;
                        coordinate[0]--;
                    }
                    break;
                case 4:
                    if (coordinate[0] > turn - 1) coordinate[0]--;
                    else {
                        direction = 1;
                        coordinate[1]++;
                        turn++;
                    }
                    break;
            }
        }
        return array;
    }
}