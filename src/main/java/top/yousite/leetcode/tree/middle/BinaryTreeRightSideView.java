package java.top.yousite.leetcode.tree.middle;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    /**
     * 199.二叉树的右视图
     */
        /**
         * 输入: [1,2,3,null,5,null,4]
         * 输出: [1, 3, 4]
         * 解释:
         *
         *    1            <---
         *  /   \
         * 2     3         <---
         *  \     \
         *   5     4       <---
         *
         * 思路在答案后面:
         */
    /*public List<Integer> rightSideView(TreeNode root) {
        //BFS
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //逆序输出取第一个
                TreeNode temp = queue.poll();
                if (i==0) res.add(temp.val);
                if (temp.right != null) queue.offer(temp.right);
                if (temp.left != null) queue.offer(temp.left);
            }

        }
        return res;


    }*/

    public List<Integer> rightSideView(TreeNode root) {
        //DFS
        List<Integer> res = new ArrayList<>();
        dfs(res,root,0);
        return res;
    }

    private void dfs(List<Integer> res, TreeNode root, int depth) {
        //有右取右
        if (root == null) return;
        if (res.size() == depth) res.add(root.val);
        dfs(res,root.right,depth+1);
        dfs(res,root.left,depth+1);
    }

    /**   BFS思路:逆序遍历每行取第一个元素
     *
     *  *            1            <---
     *          *  /   \
     *          * 2     3         <---
     *          *  \     \
     *          *   5     4       <---
     *
     *                ↓
     *                ↓
     *                ↓
     *
     *
     *       --->    1
     *             /   \
     *       ---> 3     2
     *             \     \
     *       --->  4     5
     **/

    /**
     *  DFS思路:有右取右
     */
}
