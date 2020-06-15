package NO1300_1399.NO1342;

class Solution {
    int i = 0;
    public int numberOfSteps(int num) {
        for (; num >=1; num = num / 2) {
            if (num == 1) {
                i += 1;
            } else {
                if (num % 2 == 0) {
                    i++;
                } else if (num % 2 == 1) {
                    i += 2;
                }

            }

        }
        return i;
    }
}