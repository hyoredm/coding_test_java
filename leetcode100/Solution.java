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
            if (p.val != q.val) flag = false;

            TreeNode pLft = p;
            TreeNode qLft = q;
            TreeNode pRt = p;
            TreeNode qRt = q;

            while (pLft.left != null || qLft.left != null) {
                if (pLft.left != null && qLft.left != null) {
                    if (pLft.left.val != qLft.left.val) return flag = false;
                } else if (pLft.left == null && qLft.left != null) {
                    return flag = false;
                } else if (pLft.left != null && qLft.left == null) {
                    return flag = false;
                } else if (pLft.left == null && qLft.left == null) {
                    return flag = false;
                }
                pLft = pLft.left;
                qLft = qLft.left;
            }

            while (pRt.right != null || qRt.right != null) {
                if (pRt.right != null && qRt.right != null) {
                    if (pRt.right.val != qRt.right.val) flag = false;
                } else if (pRt.right == null && qRt.right != null) {
                    flag = false;
                } else if (pRt.right != null && qRt.right == null) {
                    flag = false;
                }
                pRt = pRt.left;
                qRt = qRt.left;
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
