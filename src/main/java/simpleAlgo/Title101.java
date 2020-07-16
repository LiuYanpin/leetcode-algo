package simpleAlgo;

import common.TreeNode;

/**
 * 对称二叉树
 */
public class Title101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkMirror(root.left, root.right);
    }

    private boolean checkMirror(TreeNode leftRoot, TreeNode rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        }
        if (leftRoot == null || rightRoot == null || leftRoot.val != rightRoot.val) {
            return false;
        }
        return checkMirror(leftRoot.left, rightRoot.right) && checkMirror(leftRoot.right, rightRoot.left);
    }
}
