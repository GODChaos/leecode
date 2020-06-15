package NO0_99.NO70;

class Solution {
    public int climbStairs(int n) {
        //if(n==1){return 1;}else if(n==2){return 2;}else {return climbStairs(n-2)+climbStairs(n-1) ;}
        int sum = 0;
        for (int two = 0; two <= n / 2; two++) {
            sum += Solution.doFactorial(n - two) / (Solution.doFactorial(n - 2 * two) * Solution.doFactorial(two));
        }
        return sum;
    }


    public static int doFactorial(int m) {
        int result = 1;
        if (m < 0) {
            return -1;//返回-1，说明传入数据不合法
        }
        if (m == 0) {
            return 1;
        }
        for (int i = 1; i <= m; i++) {
            result *= i;
            System.out.println(i);
        }

        return result;
    }
}

class test {


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(35));
    }
}