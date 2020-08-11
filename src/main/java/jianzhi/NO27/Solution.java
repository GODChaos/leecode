package jianzhi.NO27;

import util.TreeNode;

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
        }

        return root;
    }
}