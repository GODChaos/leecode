package NO101_199.NO117;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


class Solution {
    public Node connect(Node root) {
        if (root != null) {
            Node eldestSon = null;
            Node tempSon = null;
            Node temp = root;
            while (temp != null) {

                if (temp.left != null) {
                    if (eldestSon == null) {
                        eldestSon = temp.left;
                    }
                    if (tempSon != null) tempSon.next = temp.left;
                    tempSon = temp.left;
                }
                if (temp.right != null) {
                    if (eldestSon == null) {
                        eldestSon = temp.right;
                    }
                    if (tempSon != null) tempSon.next = temp.right;
                    tempSon = temp.right;
                }
                temp = temp.next;
            }
            connect(eldestSon);
        }
        return root;
    }
}