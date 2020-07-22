package NO101_199.NO167;


import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            Integer j = target - numbers[i];
            if (hashMap.containsKey(j))
                return new int[]{hashMap.get(j).intValue(), i};
            hashMap.put(numbers[i],i);
        }
        return new int[]{0, 0};
    }

}
