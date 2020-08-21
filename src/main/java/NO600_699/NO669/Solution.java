package NO600_699.NO669;

import util.TreeNode;

class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root != null) {


            if (root.val < L) return trimBST(root.right, L, R);
            if (root.val > R) return trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            root.left = trimBST(root.left, L, R);
        }
        return root;

    }
}