package NO200_299.NO205;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hashMap = new HashMap();
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (!hashMap.containsKey(s.charAt(i))) {
                    if (hashMap.containsValue(t.charAt(i))) return false;
                    hashMap.put(s.charAt(i), t.charAt(i));
                }

                if (hashMap.containsKey(s.charAt(i))) {
                    if (!hashMap.get(s.charAt(i)).equals(t.charAt(i))) return false;

                }

            }
            return true;
        }
        return false;
    }
}