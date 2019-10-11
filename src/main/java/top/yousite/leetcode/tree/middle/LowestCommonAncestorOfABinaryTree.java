package top.yousite.leetcode.tree.middle;

public class LowestCommonAncestorOfABinaryTree {
    /**
     * 236. 二叉树的最近公共祖先
     */
    //思路:后序遍历
    private TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return res;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return false;
        }
        int left =dfs(root.left,p,q) ? 1:0;
        int right =dfs(root.right,p,q) ? 1:0;
        int mid = (root == p ||root ==q) ? 1:0;

        if (left+right+mid>=2){
            res = root;
        }

        return left+right+mid>0;
    }
}
