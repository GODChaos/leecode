package NO101_199.NO122;

class Solution {
    public int maxProfit(int[] prices) {

        int shouyi = 0;


        if (prices.length > 0) {
            int chengben = 0;
            int flag = 0;

            for (int i = 0; i < prices.length - 1; i++) {

                if (flag == 0) {
                    if (prices[i] < prices[i + 1]) {
                        chengben = prices[i];
                        flag = 1;
                    }
                }
                if (flag == 1) {
                    if (prices[i] > prices[i + 1]) {
                        shouyi += prices[i] - chengben;
                        flag = 0;
                    }
                }

            }
            System.out.println(shouyi);
            System.out.println(flag);
            if (flag == 1) shouyi += prices[prices.length-1] - chengben;
        }
        return shouyi;
    }
}