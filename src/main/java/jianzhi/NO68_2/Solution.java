package jianzhi.NO68_2;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            while (j<strs[i].length()&&j < ans.length() && (ans.charAt(j) == strs[i].charAt(j))) {
                j++;
            }
            ans = ans.substring(0, j);
            if (ans.equals(""))
                return ans;
        }
        return ans;
    }


}
