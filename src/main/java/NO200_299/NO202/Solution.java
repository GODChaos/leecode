package NO200_299.NO202;

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();

        while (n > 1) {
            if (!hashSet.add(n)) return false;

            int suicide = 0;
            while (n > 1) {
                suicide += (n % 10) * (n % 10);
                n /= 10;
            }
            n = suicide;

        }
        return true;

    }
}
