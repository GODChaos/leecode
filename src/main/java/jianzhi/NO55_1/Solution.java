package jianzhi.NO55_1;

import util.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {

        if (root.left == null && root.right != null) return maxDepth(root.right) + 1;
        if (root.left != null && root.right == null) return maxDepth(root.left) + 1;
        if (root.left != null && root.right != null) return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
        return 1;
    }
}
