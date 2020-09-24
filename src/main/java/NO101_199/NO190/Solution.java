package NO101_199.NO190;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int num = 32;
        while (num > 0) {
            res <<= 1;
            if (n % 2 != 0) res++;
            n>>>=1;
            num--;
        }
        return res;
    }
}