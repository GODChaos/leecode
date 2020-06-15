package NO1201_1299.NO1221;

class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int count = 0;
        for (int n = 0; n < s.length(); n++) {
            if ((s.charAt(n)) == 'R') {
                r++;
            }
            if ((s.charAt(n)) == 'L') {
                l++;
            }
            while (r != 0 && r == l) {
                r = 0;
                l = 0;
                count++;
            }
        }
        return count;

    }
}