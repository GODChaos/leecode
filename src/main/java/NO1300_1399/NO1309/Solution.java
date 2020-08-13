package NO1300_1399.NO1309;

import java.util.Arrays;

class Solution {
    public String freqAlphabets(String s) {
        String[] strings=s.split("#");
        int[] array = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

    }
}