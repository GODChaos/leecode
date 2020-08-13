package NO1300_1399.NO1323;

class Solution {
    public int maximum69Number(int num) {
        int fut = 1;
        int res =0;
        while (num > fut/10) {
            if ((num/ fut)%10 == 6) res =  3 * fut;
            fut *= 10;
            System.out.println(res);
        }
        return num+res;
    }
}
