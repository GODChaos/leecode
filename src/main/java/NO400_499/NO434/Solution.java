package NO400_499.NO434;

class Solution {
    public int countSegments(String s) {
        //if (s.length()==0)return 0;
        int flag = 0;
        int res = 0;
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == ' ') {
                if (flag == 1) flag = 0;
            }
            if (s.charAt(index) != ' ') {
                if (flag == 0) {
                    flag = 1;
                    res++;
                }
            }
        }
        return res;
    }
}