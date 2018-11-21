package java.top.yousite.leetcode.tree.middle;

public class ValidateBinarySearchTree {
    /**
     * 98.验证二叉搜索树
     */
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return dfs(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    private boolean dfs(TreeNode root,long max,long min){   //会卡int，要用long
        if(root == null) return true;
        if(root.val>=max)return false;
        if(root.val<=min)return false;
        return dfs(root.left,root.val,min) && dfs(root.right,max,root.val);

    }

}
