package top.yousite.leetcode.tree.essay;

public class ConvertBstToGreaterTree {
    /**
     * 538. 把二叉搜索树转换为累加树
     */
    //思路：右中左 遍历，加 值到 根中
    int temp = 0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.right);
        root.val+=temp;
        temp=root.val;
        dfs(root.left);
    }
}
