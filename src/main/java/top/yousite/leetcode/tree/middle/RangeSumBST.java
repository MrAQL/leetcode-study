package java.top.yousite.leetcode.tree.middle;

public class RangeSumBST {
    /**
     * 938. 二叉搜索树的范围和
     */
    //dfs
    int sum =0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        dfs(root, L, R);
        return sum;
    }

    private void dfs(TreeNode root, int L, int R){
        if(root == null) return;
        if (root.val>=L &&root.val<=R){
            sum+=root.val;
            dfs(root.left,L,R);
            dfs(root.right,L,R);
        }
        if (root.val<L){
            dfs(root.right,L,R);
        }
        if (root.val>R){
            dfs(root.left,L,R);
        }
    }

}
