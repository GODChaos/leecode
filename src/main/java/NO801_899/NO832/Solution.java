package NO801_899.NO832;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int n = 0; n < A.length; n++) {
            A[n] = inverArray(A[n]);

        }
        return A;

    }

    public int[] inverArray(int[] B) {


        for (int n = 0; n < B.length / 2; n++) {
            if (B[n] == B[B.length - 1 - n]) {
                B[n] = 1 - B[n];
                B[B.length - 1 - n] = 1 - B[B.length - 1 - n];
            }
        }

        if (B.length % 2 == 1) {
            B[B.length / 2] = 1 - B[B.length / 2];
        }
        return B;
    }
}