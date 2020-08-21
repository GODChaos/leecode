package NO1300_1399.NO1394;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 1) return arr[0];
        int flag = 1;
        for (int i = arr.length - 2; i > -1; i--) {
            System.out.println(i);
            if (arr[i] == arr[i + 1]) {
                flag++;
                if (i == 0 && arr[i] == flag) ;
                return flag;
            } else if (arr[i + 1] == flag) {
                System.out.println(flag);return flag;}
            else if (i == 0 && arr[0] == 1) return 1;
            else flag = 1;
        }
        return -1;
    }
}