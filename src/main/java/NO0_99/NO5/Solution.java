package NO0_99.NO5;

class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==0)return "";
        int max = 0;
        int[] array = new int[2];
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (i - j > -1 && i + j < s.length()) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    if (2 * j + 1 > max) {
                        max = 2 * j + 1;
                        array[0] = i - j;
                        array[1] = i + j;
                    }
                } else break;
                j++;
            }
            j = 0;
            if (i + 1 < s.length()) {
                while (i - j > -1 && i + 1 + j < s.length()) {
                    if (s.charAt(i - j) == s.charAt(i + 1 + j)) {
                        if (2 * j + 2 > max) {
                            max = 2 * j + 2;
                            array[0] = i - j;
                            array[1] = i + 1 + j;
                        }
                    } else break;
                    j++;
                }
            }
        }
        return s.substring(array[0], array[1] + 1);
    }
}