
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l = nums.length;
        int[] ass = new int[l];
        int n = 0;
        for (; n < l; n++) {
            for (int m = 0; m < l; m++) {
                if (nums[m] < nums[n]) {
                    ass[n]++;
                }

            }
        }
        return ass;
    }
}