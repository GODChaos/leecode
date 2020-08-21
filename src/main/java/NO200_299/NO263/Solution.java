package NO200_299.NO263;

class Solution {
    public boolean isUgly(int num) {
        if (num >= 1) {

            while (num % 5 == 0) {
                num /= 5;
            }
            while (num % 3 == 0) {
                num /= 3;
            }

            while (num % 2 == 0) {
                num /= 2;
            }
            if (num == 1)
                return true;

        }
        return false;
    }

}
