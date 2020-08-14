package NO300_399.NO344;

class Solution {
    public void reverseString(char[] s) {
        if (s.length > 1) {
            char temp;
            for (int i = 0; i < s.length / 2; i++) {
                temp = s[i];
                s[i] = s[s.length - i];
                s[s.length - i] = temp;
            }


        }
    }
}