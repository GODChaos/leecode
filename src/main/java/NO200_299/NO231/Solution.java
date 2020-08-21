package NO200_299.NO231;

class Solution {
    public boolean isPowerOfTwo(int n) {
        while (n > 0) {
            if (fut == n) return true;
            fut *= 2;
        }
        return false;
    }
}