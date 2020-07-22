package NO101_199.NO128;

import java.util.Stack;

class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack();
        String newString = "";
        for (int n = 0; n < s.length(); n++) {
            int m = (int) s.charAt(n);
            if (((47 < m) && (m < 58)) || ((64 < m) && (m < 91))) newString += s.charAt(n);
            if ((96 < m) && (m < 123)) newString += (char) (m - 32);
        }
        System.out.println(newString);
        if (newString.length() < 2) return true;
        else {
            for (int n = 0; n < newString.length() / 2; n++) {
                newString.charAt(n);
                stack.push(newString.charAt(n));
            }
            System.out.println(stack.toString());
            for (int n = (newString.length() + 1) / 2; n < s.length(); n++) {

                char peek = stack.peek();
                if (peek == newString.charAt(n)) stack.pop();
                else return false;

            }
            return true;

        }
    }
}

