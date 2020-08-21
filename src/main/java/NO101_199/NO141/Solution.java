package NO101_199.NO141;

import util.ListNode;

import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (!hashSet.add(head)) return false;
        }
        return true;
    }
}