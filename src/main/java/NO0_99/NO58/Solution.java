package NO0_99.NO58;

class Solution {
    public int lengthOfLastWord(String s) {
        int flag = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') flag = i;
        }
        if (flag == -1) return s.length();
        return s.length() - flag - 1;
    }
}