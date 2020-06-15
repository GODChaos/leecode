package NO0_99.NO19;


import java.util.ArrayList;
import java.util.Stack;

class Solution {

    public boolean isPalindrome(int x) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            while (x >= 1) {
                arrayList.add(x % 10);
                x = (x / 10);
            }
            //System.out.println(arrayList.toString());
            int l = arrayList.size();
            for (int i = 0; i * 2 < l - 1; i++) {
                stack.push(arrayList.get(i));
               // System.out.println(stack);
            }
            for (int j = (l + 1) / 2; j < l; j++) {
                //System.out.println(stack.peek());
                //System.out.println(j);
                if (stack.pop() != arrayList.get(j)) {
                    return false;
                }
            }
            return true;
        }

    }

}
