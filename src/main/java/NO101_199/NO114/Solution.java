package NO101_199.NO114;


import util.TreeNode;

class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        if (root.left != null) {
            if (root.right != null) {
                TreeNode next = root.left;
                while (next.right != null) {
                    next = next.right;
                }
                next.right = root.right;
            }
            root.right = root.left;
            root.left = null;
        }
         flatten(root.right);
    }
}
