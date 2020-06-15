package NO701_799.NO739;//package NO38;

class Solution {
    public int[] dailyTemperatures(int[] T) {
        for (int i = 0; i < T.length; i++) {
            int flag = 0;
            for (int j = i; j < T.length; j++) {
                if (T[j] > T[i]) {
                    flag = j - i;
                    break;
                }
            }
            T[i] = flag;
        }
        return T;
    }

}
