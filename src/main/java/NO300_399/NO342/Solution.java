package NO300_399.NO342;

class Solution {
    public boolean isPowerOfFour(int num) {
        while (num > 4) {
            if ((num &0b00000000_00000000_00000000_0000000011) != 0) return false;
                num >>>= 2;
            System.out.println(num);

        }
        if (num == 1) return true;
        else return false;
    }
}