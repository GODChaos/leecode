package NO1500_1599.NO1518;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int surplus = 0;
        while (numBottles + surplus >= numExchange) {
            int temp = numBottles;
            numBottles = (numBottles + surplus) / numExchange;
            surplus = (temp + surplus) % numExchange;
            res += numBottles;
            System.out.println(res + "" + surplus + "" + numBottles);
        }
        return res;
    }
}