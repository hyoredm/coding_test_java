package leetcode104;

class Solution {
    int depth = 0;
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) return 0;
        int lftDepth = 0;
        int rgtDepth = 0;
        lftDepth += maxDepth(root.left)+1;
        rgtDepth += maxDepth(root.right)+1;
        if(lftDepth >= rgtDepth) {
            depth = lftDepth;
        }
        else if(lftDepth < rgtDepth) {
            depth = rgtDepth;
        }

        return depth;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
