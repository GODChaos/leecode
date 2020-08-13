package NO1400_1499.NO1409;

class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] P = new int[m];
        int[] res = new int[queries.length];
        for (int i = 1; i < m + 1; i++) {
            P[i - 1] = i;
        }
        for (int i = 0; i < queries.length; i++) {
            int n = 0;
            while (P[n] != queries[i]) {
                n++;
                System.out.println(n);
            }
            res[i] = n;
            int temp = P[n];
            while (n > 0) {
                P[n] = P[n - 1];
                n--;
            }
            P[0] = temp;
        }
        return res;
    }
}
