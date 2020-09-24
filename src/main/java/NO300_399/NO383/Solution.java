package NO300_399.NO383;//package NO38;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < ransomNote.length(); i++) {

            if (hashMap.containsKey(ransomNote.charAt(i))) {
                hashMap.put(ransomNote.charAt(i), hashMap.get(ransomNote.charAt(i)) + 1);
            } else {
                hashMap.put(ransomNote.charAt(i), 1);
            }
        }
        System.out.println("aaaaa"+hashMap.toString());
        if (hashMap.isEmpty()) return true;
        for (int i = 0; i < magazine.length(); i++) {
            if (hashMap.containsKey(magazine.charAt(i))) {
                hashMap.put(magazine.charAt(i), hashMap.get(magazine.charAt(i)) - 1);
                System.out.println(hashMap.toString());
                if (hashMap.get(magazine.charAt(i)) == 0) hashMap.remove(magazine.charAt(i));
                System.out.println("bbbb"+hashMap.toString());
                if (hashMap.isEmpty()) return true;
            }
        }
        return false;
    }
}