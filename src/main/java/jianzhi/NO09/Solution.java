package jianzhi.NO09;

import java.util.Stack;

class CQueue {

    public CQueue() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();

    }

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public void appendTail(int value) {
        stack1.push(value);


    }

    public int deleteHead() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int res = stack2.pop();

        return res;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
