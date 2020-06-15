package NO1201_1299.NO1299;

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = 0;

        while (n < arr.length - 1) {
            int m = n + 1;
            int max = 0;
            int index = 0;

            while (m < arr.length) {
                if (arr[m] > max) {
                    max = arr[m];
                    index = m;
                }
                m++;
            }
            while (n < index ) {
                arr[n] = max;
                n++;
            }


        }
        arr[arr.length - 1] = -1;
        return arr;
    }

}
