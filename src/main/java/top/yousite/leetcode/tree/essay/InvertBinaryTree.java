package java.top.yousite.leetcode.tree.essay;

public class InvertBinaryTree {
    /**
     * 226. 翻转二叉树
     */
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = invertTree(root.left);  //节点暂存
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
}
