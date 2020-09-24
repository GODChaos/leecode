package NO300_399.NO387;//package NO38;

import util.TreeNode;

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {

            if (hashMap.containsKey(s.charAt(i))) {
                if (hashMap.get(s.charAt(i)) != -1)
                    hashMap.put(s.charAt(i), -1);
            } else {
                hashMap.put(s.charAt(i), i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsValue(i)) return i;
        }
        return -1;
    }
}
