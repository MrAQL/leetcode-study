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
        if (root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        return preorderTraversal(root.right);
    }

    //非递归实现
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            /*int size=stack.size();
            for(int i =0;i<size;i++){*/     //bfs这步是为了得到各层次
            TreeNode temp = stack.pop();
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
            res.add(temp.val);
            //}

        }
        return res;
    }
}
