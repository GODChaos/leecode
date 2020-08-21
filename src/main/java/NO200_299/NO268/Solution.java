package NO200_299.NO268;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != 0 && nums[i] != i + 1) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[nums[i] - 1] = temp;

                System.out.println(Arrays.toString(nums));
            }
            if (nums[i] == 0) res = i + 1;
        }
        return res;
    }


}