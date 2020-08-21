package NO101_199.NO121;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int shouyi = 0;
        int min = prices[0];
        //int shouyiNO = -1;
        //int minNO = -1;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                //  minNO = i;
                min = prices[i];
            }
            if (prices[i] - min > shouyi) {
                shouyi = prices[i] - min;
            }
        }
        return shouyi;
    }
}