package PointToOffer;

import common.TreeNode;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 */
public class Offer55Two {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(depth(root.left) - depth(root.right)) < 2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
