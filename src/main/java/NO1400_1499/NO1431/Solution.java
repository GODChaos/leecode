package NO1400_1499.NO1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l = candies.length;
        int max = 0;
        List<Boolean> ret = new ArrayList<Boolean>();
        for (int i = 0; i < l; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int j = 0; j < l; j++) {
            if (candies[j] + extraCandies >= max) {
                ret.add(j, true);
            } else {
                ret.add(j, false);
            }

        }
        return ret;
    }
}
