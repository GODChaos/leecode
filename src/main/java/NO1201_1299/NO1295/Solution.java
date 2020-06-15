package NO1201_1299.NO1295;

class Solution {
    public int findNumbers(int[] nums) {
        int t = 0;
        for (int n : nums) {
            int flag = 1;
            while (n >9) {
                flag++;
                n /= 10;
            }
            if (flag % 2 == 0) {
                t++;
            }
        }
        return t;
    }
}