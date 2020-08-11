package mianshiti.NO0202;

import util.ListNode;

class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode tail = head;
        while (k != 0) {
            head = head.next;
            k--;
        }
        while (head != null) {
            head = head.next;
            tail = tail.next;
        }
        return tail.val;
    }
}