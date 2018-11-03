package java.top.yousite.leetcode.tree.essay;

public class BalancedBinaryTree {
    /**
     * 110. 平衡二叉树
     */
   public boolean isBalanced(TreeNode root) {
       if (root == null) return true; //空树为平衡树
       int left_depth=getTreeMaxDepth(root.left);
       int right_depth=getTreeMaxDepth(root.right);
       if (Math.abs(left_depth - right_depth)>1)return false;
       else
           //当满足：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。这个条件后
           //       要判断是否左子树，右子树也满足这个条件
           return isBalanced(root.right)&&isBalanced(root.left); //

   }
    //获取树深度
    private int getTreeMaxDepth(TreeNode root){
        if (root == null) return 0;
        int left_depth = getTreeMaxDepth(root.left);
        int right_depth = getTreeMaxDepth(root.right);
        return Math.max(left_depth,right_depth)+1;
    }
}
