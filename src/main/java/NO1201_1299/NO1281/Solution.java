package NO1201_1299.NO1281;

class Solution {
    public int subtractProductAndSum(int n) {
        int a = 1;
        int b = 0;
        while (n > 0) {
            a *= n % 10;
            b += n % 10;
            n=n>>1;
        }
        return a - b;
    }
}