package NO200_299.NO204;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public int countPrimes(int n) {
        for (int i = 2; i < n + 1; i++) {
            int flag = 0;
            for (Integer prime : arrayList) {
                if (i / prime * prime == i) {
                    flag = 1;
                    break;
                }
                if (prime * prime > n) break;
            }
            if (flag == 0) arrayList.add(i);
        }

        return arrayList.size();
    }
}