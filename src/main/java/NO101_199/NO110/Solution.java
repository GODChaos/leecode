package NO101_199.NO110;//package NO38;

import util.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null || (isBalanced(root.left) && isBalanced(root.right) && (height(root.left) - height(root.right)) * (height(root.left) - height(root.right)) <= 1)) {
            return true;
        } else return false;
    }


    public int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}