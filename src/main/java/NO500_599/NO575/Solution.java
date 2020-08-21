package NO500_599.NO575;//package NO38;

import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candies) {
        int kind=0;
        HashSet<Integer> hashSet =new HashSet<>();
        for(int i=0;i<candies.length;i++){
            if(hashSet.add(candies[i]))kind++;
        }
return Math.min(kind,candies.length/2);
    }
}