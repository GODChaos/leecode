package NO700_799.NO700;

import util.TreeNode;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root.val == val) return root;
        if (root.val > val) {
            if (root.left == null) return null;
            else return searchBST(root.left, val);
        }
        if (root.val < val) {
            if (root.right == null) return null;
            else return searchBST(root.right, val);
        }
        return root;
    }
}