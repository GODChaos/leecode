package jianzhi.NO24;

import util.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;
        ListNode temp = null;
        while (head.next != null) {
            temp = head;
            head = head.next;
            temp.next = tail;
            tail = temp;
        }
        return head;
    }
}