package leetcode100;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        boolean flag = true;

        if(p != null && q != null) {
            if(p.val != q.val) flag = false;

            if(p.left != null && q.left != null) {
                if(p.left.val != q.left.val) flag = false;
            }
            else if(p.left == null && q.left != null) {
                flag = false;
            }
            else if(p.left != null && q.left == null) {
                flag = false;
            }

            if(p.right != null && q.right != null) {
                if(p.right.val != q.right.val) flag = false;
            }
            else if(p.right == null && q.right != null) {
                flag = false;
            }
            else if(p.right != null && q.right == null) {
                flag = false;
            }
        }
        else if(p == null && q!= null) {
            flag = false;
        }
        else if(p != null && q == null) {
            flag = false;
        }

        return flag;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
