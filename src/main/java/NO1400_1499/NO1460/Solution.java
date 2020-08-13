package NO1400_1499.NO1460;

import java.util.HashMap;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(target[i])) {
                hashMap.put(target[i], hashMap.get(target[i]) + 1);
                if (hashMap.get(target[i]) == 0) {
                    hashMap.remove(target[i]);
                }
            } else hashMap.put(target[i], 1);

            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) - 1);
                if (hashMap.get(arr[i]) == 0) {
                    hashMap.remove(arr[i]);
                }
            } else hashMap.put(arr[i], -1);


        }
    return     hashMap.isEmpty();
        }
    }
