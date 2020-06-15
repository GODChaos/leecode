package NO1101_1199.NO1111;

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int flag = 0;
        int[] ass = new int[seq.length()];
        for (int n = 0; n < seq.length(); n++) {

            switch (seq.charAt(n)) {
                case '(':
                    flag++;
                    ass[n] = flag;

                    break;
                case ')':

                    ass[n] = flag;
                    flag--;
                    break;
            }

        }
        return ass;
    }
}