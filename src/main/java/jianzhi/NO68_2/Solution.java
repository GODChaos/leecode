package jianzhi.NO68_2;


import util.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (isAncestor(root, p) && (isAncestor(root, q))) {
            if (isAncestor(root.left, p) && (isAncestor(root.left, q))) return lowestCommonAncestor(root.left, p, q);
            if (isAncestor(root.right, p) && (isAncestor(root.right, q))) return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public boolean isAncestor(TreeNode root, TreeNode target) {
        if (root == null) return false;
        else if (root==target||root.left == target || root.right == target) return true;
        else return (isAncestor(root.left, target) || isAncestor(root.right, target));
    }
}