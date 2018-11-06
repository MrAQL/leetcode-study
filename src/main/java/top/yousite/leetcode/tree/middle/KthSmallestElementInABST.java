package java.top.yousite.leetcode.tree.middle;

public class KthSmallestElementInABST {
    /**
     * 230. 二叉搜索树中第K小的元素
     */

    class Solution {
        List<Integer> res = new ArrayList();
        public int kthSmallest(TreeNode root, int k) {
            //法1.中序递归放入list中，然后从list中查找
            in(root);
            return res.get(k-1);

        }

        public void in(TreeNode root){  //中序遍历
            if (root == null) return ;
            in(root.left);
            res.add(root.val);
            in(root.right);
        }
    }
}
