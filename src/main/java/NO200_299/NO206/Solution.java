package NO200_299.NO206;//package NO38;

class Solution {
    ListNode tail=null;
    public ListNode reverseList(ListNode head) {
        if(head!=null){
        ListNode temp=head.next;
        head.next=tail;
        tail=head;
        reverseList(temp);}

        return tail;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
