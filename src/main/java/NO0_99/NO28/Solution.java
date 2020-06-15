package NO0_99.NO28;

class Solution {
    public int strStr(String haystack, String needle) {

        int a = haystack.length();
        int b = needle.length();
        if (a < b) {
            return -1;
        } else if (a == b) {
            if (haystack.equals(needle)) return 0;
            else return -1;
        } else {
            for (int i = 0; i < a - b; i++) {
                if (haystack.substring(i, i + b).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }

    }
}


