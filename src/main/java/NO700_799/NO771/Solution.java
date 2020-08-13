package NO700_799.NO771;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int i = 0;
        for (int n = 0; n < J.length(); n++) {
            for (int m = 0; m < S.length(); m++) {
                if (J.charAt(n) == S.charAt(m)) {
                    i++;
                }

            }
        }

        return i;
    }
}