package java.top.yousite.offer.array;


/**
 * 重建二叉树
 */
public class ReConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = help(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    //递归遍历(pre前序，in中序)
    private TreeNode help(int[] pre, int preBegin, int preEnd, int[] in, int inBegin, int inEnd) {
        if (preBegin < preEnd || inBegin < inEnd) return null;
        //根节点
        TreeNode root = new TreeNode(pre[preBegin]);

        for (int i = inBegin; i <= inEnd; i++) {
            if (in[i] == pre[preBegin]) {
                root.left = help(pre, preBegin + 1, preBegin + i - inBegin, in, inBegin, i - 1);
                root.right = help(pre, i - inBegin + preBegin + 1, preEnd, in, i + 1, inEnd);
                break;
            }
        }
        return root;
    }
}
