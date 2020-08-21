package NO101_199.NO111;

import util.TreeNode;

class Solution {
    public int minDepth(TreeNode root) {
        if (root==null)return 0;
        return Math.min (minDepth(root.left ),minDepth(root.left ))+1;

    }
}