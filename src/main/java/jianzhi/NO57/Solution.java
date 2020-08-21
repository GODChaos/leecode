package jianzhi.NO57;//package NO38;

import java.util.HashSet;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int [] res=new int[2];
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(target - nums[i])) {

                int[] res = {target - nums[i], nums[i]};
                return res;

            }
            hashSet.add(nums[i]);

        }
        return null;
    }
}