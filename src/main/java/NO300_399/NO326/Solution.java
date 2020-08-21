package NO300_399.NO326;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n<3)return false;
        while (n > 1) {
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }
}