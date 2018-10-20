package main.java.top.yousite.leetcode.tree.middle;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    /**
     * 144. 二叉树的前序遍历
     */
    //递归
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {return list;};
        list.add(root.val);
        preorderTraversal(root.left);
        return preorderTraversal(root.right);
    }
}
