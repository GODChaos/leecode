package NO600_699.NO633;//package NO38;

class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; 2*i * i <= c; i++) {

                for (int j = 0; j * j + i * i <= c; j++) {
                    if (j * j + i * i == c) return true;
                    System.out.println(i + "" + j);
                }

            }
        return false;
        }

    }
