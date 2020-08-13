package NO1300_1399.NO1304;

import java.util.Arrays;

class Solution {
    public int[] sumZero(int n) {
      int[]res =   new int[n];
      for(int i=0;i< res.length-1;i++){
          if(i%2==0)res[i]=-(i+2)/2;
          if(i%2==1)res[i]=(i+2)/2;
      }
        if(n%2==1) res[res.length-1]=0;

      return res;



    }
}
