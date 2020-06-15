package mianshiti.NO5;

class Solution {
    public String replaceSpace(String s) {
        int n = 0;

        while (n < s.length()) {
            if (s.charAt(n) == ' ') {
                s = s.substring(0,n + 1) + "%20" + s.substring(n + 1);
                n += 2;
            }
            n++;
        } return s;
    }

}