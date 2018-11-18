package java.top.yousite.leetcode.tree.essay;

public class PathSum {
    /**
     * 112.路径总和
     */
    /**
     *给定如下二叉树，以及目标和 sum = 22，
     *
     *               5
     *              / \
     *             4   8
     *            /   / \
     *           11  13  4
     *          /  \      \
     *         7    2      1
     * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
     */
    boolean res ;
    public boolean hasPathSum(TreeNode root, int sum) {
        dfs(root,sum);
        return res;
    }

    private void dfs(TreeNode root, int sum) {
        if (sum <0 )return;
        if (sum == 0 ||root.left == null ||root.right ==null) res = true;
        dfs(root.left,sum-root.val);
        dfs(root.right,sum-root.val);

    }

}
