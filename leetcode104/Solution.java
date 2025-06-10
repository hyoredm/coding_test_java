package leetcode104;

class Solution {
    int depth = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) return depth;
        depth++;
        int lftDepth = maxDepth(root.left);
        int rgtDepth = maxDepth(root.right);
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
