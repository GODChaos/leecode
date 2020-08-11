package NO300_399.NO392;


class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s=="") return true;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(0)) {
                return isSubsequence(s.substring(1), t.substring(i + 1));
            }
        }
        return false;
    }
}