package PointToOffer;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 */
public class Offer55One {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0, size;
        while (!queue.isEmpty()) {
            count++;
            size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        System.out.println(maxDepth(root));
    }
}
