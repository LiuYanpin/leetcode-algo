package PointToOffer;

import common.TreeNode;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 */
public class Offer54 {
    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        int[] result = new int[2];
        search(root, result, k);
        return result[1];
    }

    private static void search(TreeNode root, int[] list, int k) {
        if (root == null) {
            return;
        }
        if (list[0] == k) return;
        search(root.right, list, k);
        if (list[0] == k) return;
        list[0] += 1;
        list[1] = root.val;
        search(root.left, list, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        System.out.println(new Offer54().kthLargest(root, 3));
    }

    private static void swap(int[] nums) {
        nums[0] = 0;
    }

}
