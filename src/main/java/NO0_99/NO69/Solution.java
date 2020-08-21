package NO0_99.NO69;
class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }
}

���ߣ�LeetCode-Solution
        ���ӣ�https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode-solution/
        ��Դ�����ۣ�LeetCode��
        ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������