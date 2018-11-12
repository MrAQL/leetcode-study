package java.top.yousite.leetcode.tree.middle;

public class FlattenBinaryTreeToLinkedList {
    /**
     * 114. 二叉树展开为链表
     */
        /**
         * 例如，给定二叉树
         *
         *     1
         *    / \
         *   2   5
         *  / \   \
         * 3   4   6
         * 将其展开为：
         *
         * 1
         *  \
         *   2
         *    \
         *     3
         *      \
         *       4
         *        \
         *         5
         *          \
         *           6
         *
         */
    public void flatten(TreeNode root) {
        //dfs 先序遍历（找到最左的节点，断开夫节点与右节点，把左节点接上）
        if (root == null) return;
        //递归到最后一层
        //左
        if (root.left!=null) flatten(root.left);
        //右
        if (root.right!=null) flatten(root.right);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        //连到右节点上
        while (root.right!=null){   //这步是为了插入右子树的最右
            root=root.right;
        }
        root.right = temp;
    }

}
