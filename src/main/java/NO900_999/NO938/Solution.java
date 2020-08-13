package NO900_999.NO938;

class Solution {


    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root != null){
            int result=0;
            if(root.val >= L || root.val <= R)
             result += root.val;
            if(root.val<R) result += rangeSumBST(root.right, L, R);
            if(root.val>L)  result += rangeSumBST(root.left, L, R);

            return result;
        }else return 0;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
