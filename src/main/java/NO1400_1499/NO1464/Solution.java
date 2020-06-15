package NO1400_1499.NO1464;

class Solution {
    public int maxProduct(int[] nums) {
        int flag = 0;
        for (int m = 0; m < nums.length - 1; m++) {
            for (int n = m + 1; n < nums.length; n++) {
                if (((nums[m] - 1) * (nums[n] - 1)) > flag) {
                    flag = ((nums[m] - 1) * (nums[n] - 1));
                }
            }
        }
        return flag;

    }
}
