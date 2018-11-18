package java.top.yousite.leetcode.tree.essay;

import sun.security.provider.DSAKeyFactory;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves {
    /**
     * 404. 左叶子之和
     */
    /**
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     *
     * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
     *
     */
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return sum;

    }
    private void dfs(TreeNode root){
        if (root ==null) return;
        if(root.left!=null && root.left.left == null &&root.left.right == null){    //root为根节点
            sum+=root.left.val;
        }
        dfs(root.left);

        dfs(root.right);
    }
}
