package NO101_199.NO100;

import util.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p != null && q != null) {
            if (p.val == q.val && isSameTree(p.left, q.left) == true && isSameTree(p.right, q.right))
                return true;
        }
        return false;
    }
}