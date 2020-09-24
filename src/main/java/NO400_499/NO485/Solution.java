package NO400_499.NO485;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int res = 0;
        int temp = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 1) {
                if (flag == 1) {
                    flag = 0;
                    res=Math.max(res,temp);
                    temp=0;

                }
                if (nums[index] == 1) {
                    if (flag == 0) {
                        flag = 1;
                        temp++;
                    }
                }
            }

        } return Math.max(res,temp);
    }
}