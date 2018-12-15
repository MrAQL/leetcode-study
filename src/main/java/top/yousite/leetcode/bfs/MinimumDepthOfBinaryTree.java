package java.top.yousite.leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    /**
     * 111. 二叉树的最小深度
     */
    //bfs
    public int minDepth(TreeNode root) {
        int depth =1;   //最小深度
        if (root == null) return depth-1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left !=null) queue.offer(temp.left);
                if (temp.right !=null) queue.offer(temp.right);
                if (temp.left== null &&temp.right == null) return depth; //左右都为空，深度最小
            }
            depth++;
        }
        return depth;
    }
}
