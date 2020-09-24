package NO500_599.NO538;//package NO38;

import util.TreeNode;

class Solution {
    public TreeNode convertBST(TreeNode root) {
        int flag = 0;
        if (root != null) {
            if (root.right!=null)root.val += convertBST(root.right).val;
            flag = root.val;
            if (root.left!=null) root.left.val = convertBST(root.left).val + flag;
        }
        return root;
    }
}