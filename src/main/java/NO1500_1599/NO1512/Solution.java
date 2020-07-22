package NO1500_1599.NO1512;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) hashMap.put(nums[i], 1);
            else {
                int temp = hashMap.get(nums[i]);
                hashMap.remove(nums[i]);
                hashMap.put(nums[i], temp + 1);
            }
        }
        int result = 0;
        for (Integer value : hashMap.values()) {
            result += value * (value - 1) / 2;
        }
        return result;
    }
}
