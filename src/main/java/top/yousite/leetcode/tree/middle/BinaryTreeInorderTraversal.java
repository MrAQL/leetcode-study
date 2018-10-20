package main.java.top.yousite.leetcode.tree.middle;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    /**
     * 94. 二叉树的中序遍历
     */

    //递归
    List<Integer> resList= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root ==null){return resList;}
        inorderTraversal(root.left);
        resList.add(root.val);
        return inorderTraversal(root.right);
    }

}
