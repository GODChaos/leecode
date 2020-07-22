package NO1400_1499.NO1486;

class Solution {
    public int xorOperation(int n, int start) {
        int res = start;
        int temp = start;
        for (; n > 1; n--) {
            temp += 2;
            res = res ^ temp;
        }
        return res;

    }
}

