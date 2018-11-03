package java.top.yousite.leetcode.tree.essay;

/**
 * 104. 二叉树的最大深度
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        int leftMax= maxDepth(root.left);       //得到左子树深度
        int rightMax= maxDepth(root.right);     //得到右子树深度
        return Math.max(leftMax,rightMax)+1;
    }
}
