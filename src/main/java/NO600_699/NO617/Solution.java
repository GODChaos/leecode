package NO600_699.NO617;//package NO38;

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root=null;
        if (t1 == null && t2 == null) return null;
        if (t1 == null && t2 != null) root = t2;
        if (t1 != null && t2 == null) root = t1;
        if (t1 != null && t2 != null) {
            root = new TreeNode(t1.val += t2.val);
            root.left = mergeTrees(t1.left, t2.left);
            root.right = mergeTrees(t1.right, t2.right);
        }
        return root;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

