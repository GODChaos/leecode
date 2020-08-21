package NO200_299.NO234;

import util.ListNode;

import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head != null) {
            Stack<ListNode> stack = new Stack<>();
            stack.push(head);
            int flag = 0;
            while (head.next != null) {
                head = head.next;
                flag++;
                if (flag % 2 == 0) stack.push(stack.peek().next);

            }
            head = stack.peek().next;
            if (flag % 2 == 0) stack.pop();

            System.out.println(stack.size());
            System.out.println(flag);
            while (head != null) {
                if (stack.pop().val != head.val) return false;
                head=head.next;
            }

        }
        return true;
    }
}