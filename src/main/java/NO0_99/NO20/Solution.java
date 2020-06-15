package NO0_99.NO20;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack<Character>();
        for (char n : s.toCharArray()) {
            switch (n) {
                case '(':
                case '[':
                case '{':
                    stack.push(n);
                    continue;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (!stack.peek().toString().equals("(")) {
                        return false;
                    } else {
                        stack.pop();
                        continue;
                    }
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (!stack.peek().toString().equals("[")) {
                        return false;
                    } else {
                        stack.pop();
                        continue;
                    }
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (!stack.peek().toString().equals("{")) {
                        return false;
                    } else {
                        stack.pop();
                        continue;
                    }

            }

        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}