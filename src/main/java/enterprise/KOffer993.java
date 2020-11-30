package enterprise;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class KOffer993 {
    private Map<Integer, Integer> depth = new HashMap<>();
    private Map<Integer, TreeNode> parent = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null);
        return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
    }

    private void dfs(TreeNode root, TreeNode node) {
        if (node != null) {
            depth.put(node.val, node != null ? 1 + depth.get(node.val) : 0);
            parent.put(node.val, node);
            dfs(node.left, node);
            dfs(node.right, node);
        }
    }
}
