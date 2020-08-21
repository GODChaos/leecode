package NO200_299.NO219;

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i]) && (i - hashMap.get(nums[i]) >= k)) {
                System.out.println(i);
                return true;
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }

}
