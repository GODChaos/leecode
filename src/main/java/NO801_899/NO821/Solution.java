package NO801_899.NO821;//package NO38;


class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        int flag = 0;
        int head = -1;
        int tail = -1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                tail = i;
                flag = -1;
                if (head == -1) head = i;
            }
            res[i] = ++flag;
        }
        flag = 0;
        System.out.println(tail);
        for (int i = tail; i > head; i--) {
            if (res[i] == 0) {
                flag = -1;
            }
            flag++;
            System.out.println(flag);
            if (flag < res[i]) res[i] = flag;
        }
        flag = 0;
        for (int i = head; i > -1; i--) {
            res[i] = flag++;
        }
        return res;

    }
}