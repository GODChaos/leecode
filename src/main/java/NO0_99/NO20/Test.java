package NO0_99.NO20;

import java.util.Stack;

class Test {
    public static void main(String[] args) {
        char n = '(';
        char h = '(';
        Character m = '(';
        Character l = '(';

        System.out.println(m.equals(n));


        Stack stack = new Stack<Character>();
        stack.push(n);

        System.out.println(!stack.peek().toString().equals("("));
    }


    }
