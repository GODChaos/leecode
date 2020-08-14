package NO900_999.NO905;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int head = 0;
        int tail = A.length - 1;
        while (head < tail) {
            if (A[head] % 2 == 1) {
                while (A[tail] % 2 == 1) {
                    tail--;
                    if (head >= tail) break;
                }
                if (A[tail] % 2 == 0) {
                    A[head] = A[head] + A[tail];
                    A[tail] = A[head] - A[tail];
                    A[head] = A[head] - A[tail];
                    head++;
                    tail--;
                }
            }
            head++;
        }
        return A;
    }
}