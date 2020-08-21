package NO200_299.NO203;

import util.ListNode;

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = new ListNode(0);
        temp.next=head;
        ListNode res=temp;
        while (head != null) {
            while (temp.next != head) temp = temp.next;
            if (head.val == val) {
                temp.next = head.next;
            }
            head = head.next;

        }
        return res.next;
    }
}