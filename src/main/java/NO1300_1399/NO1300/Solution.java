package NO1300_1399.NO1300;

import java.util.Arrays;

class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int sum = 0;
        int l = arr.length;
        int h = arr[l - 1];//开始降低中 的 最低柱子

        int number = 1;//降低中的柱子数量
        int next = arr[l - 1 - number];//下一个柱子高度
        for (int n : arr) {
            sum += n;
        }
        int s = sum - target;
        int last = 0;
        // int step = 0;
        while (s > 0) {
            if (h == next) {
                if (number < l) {
                    number++;
                    next = arr[l - 1 - number];
                } else {
                    next = 0;
                }
            } else {
                last = s;
                s -= number;
                h--;
                System.out.println((Arrays.toString(arr)));
            }
        }
        if (-s > last) {
            return h+1;
        } else {
            return h ;
        }

    }
}