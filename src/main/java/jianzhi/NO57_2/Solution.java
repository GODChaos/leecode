package jianzhi.NO57_2;

import java.util.ArrayList;

class Solution {
    public int[][] findContinuousSequence(int target) {
        int n = 2;
        ArrayList<int[]> arrayList = new ArrayList<>();

        while ((target - n * (n + 1) / 2) >= 0) {

            if ((target - n * (n + 1) / 2) % n == 0) {
                int[] array = new int[n];
                for (int i = 0; i < n; i++) array[i] = (target - n * (n + 1) / 2) / n + i + 1;
                arrayList.add(array);
            }

            n++;
        }
        int[][] res = new int[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(arrayList.size()-i-1);
        }
        return res;
    }
}