package NO300_399.NO389;//package NO38;

import java.util.HashMap;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {

            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        //  System.out.println("aaaaa"+hashMap.toString());

        for (int i = 0; i < t.length(); i++) {
            if (hashMap.containsKey(t.charAt(i))) {
                hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
                //  System.out.println(hashMap.toString());
                if (hashMap.get(t.charAt(i)) == 0) hashMap.remove(t.charAt(i));
                // System.out.println("bbbb"+hashMap.toString());
            }
            else return t.charAt(i);
        }
        return 'r';
    }
}