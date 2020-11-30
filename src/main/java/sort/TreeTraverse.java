package sort;

import common.TreeNode;
import common.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeTraverse {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        c.left = g;
        Utils.printArrayList(order3(root));

        ArrayList<Integer> integers = new ArrayList<>();


        order2(root,integers);
        System.out.println(integers);
    }

    public static void order(TreeNode root,List<Integer> list) {
        if(Objects.nonNull(root)){
            list.add(root.val);
            order(root.left,list);
            order(root.right,list);
        }
    }
    public static void order2(TreeNode root,List<Integer> list) {
        if(Objects.nonNull(root)){
            order2(root.left,list);
            order2(root.right,list);
            list.add(root.val);
        }
    }

    public static ArrayList<Integer>  order3(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        if(root==null){
            return integers;
        }
        List<TreeNode> tmp=new ArrayList<>();
        integers.add(root.val);
        addLeafNode(root, tmp);
        while (!tmp.isEmpty()){
            TreeNode remove = tmp.remove(0);
            integers.add(remove.val);
            addLeafNode(remove,tmp);
        }
        return integers;
    }

    private static void addLeafNode(TreeNode root, List<TreeNode> tmp) {
        if(root.left!=null){
            tmp.add(root.left);
        }
        if(root.right!=null){
            tmp.add(root.right);
        }
    }


}
