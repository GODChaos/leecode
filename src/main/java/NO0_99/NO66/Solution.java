package NO0_99.NO66;

class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==1&&digits[0]==9)return new int[]{1, 0};
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        if (digits[digits.length - 1] != 10) return digits;
        digits[digits.length - 1] = 0;
        for (int i = digits.length - 2; i > -1; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }

        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}


