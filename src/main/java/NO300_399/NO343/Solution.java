package NO300_399.NO343;

class Solution {
    public int integerBreak(int n) {
        int res = 1;
        for (int m = 2; m < n; m++) {
            int temp = 1;
            for (int i = 0; i < n % m; i++) temp *= n / m + 1;
            for (int i = 0; i < m - n % m; i++) temp *= n / m;
            if (temp > res) res = temp;
            else break;
        }
        return res;
    }
}