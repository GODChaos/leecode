package NO0_99.NO83;

import util.ListNode;

import java.util.HashSet;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        ListNode father = head;
        HashSet<Integer> hashSet = new HashSet<>();

        head = head.next;

        while (head != null) {
            if (!hashSet.add(head.val)) {
                father.next = head.next;
            } else {
                father = head;
            }
            head = head.next;
        }
        return res;

    }
}