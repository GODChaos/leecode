package NO5400_5499.NO5420;

class Solution {
    public int[] finalPrices(int[] prices) {
        int l = prices.length;
        for (int n = 0; n < l - 1; n++) {
            for (int m = n + 1; m < l; m++) {
                if (prices[m] < prices[n]) {
                    prices[n] -= prices[m];

                }
            }
        }
        return prices;

    }
}