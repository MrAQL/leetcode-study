package main.java.top.yousite.leetcode.tree.middle;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    /**
     * 94. 二叉树的中序遍历
     */

    //递归
    /*List<Integer> resList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return resList;
        }
        inorderTraversal(root.left);
        resList.add(root.val);
        return inorderTraversal(root.right);
    }*/

    //非递归
    List<Integer> res= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return res;
        help(root);
        return res;
    }

    private void help(TreeNode root){
        if(root == null )return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() ||root!=null){
            if (root!=null){
                stack.push(root);
                root=root.left;
            }else{
                TreeNode temp= stack.pop();
                res.add(temp.val);
                root = temp.right;
            }
        }
    }

}
