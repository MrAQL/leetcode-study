package java.top.yousite.leetcode.tree.middle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    /**
     *102.二叉树的层次遍历
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        //bfs( 与107一样，107只是改为头节点插入 )
        List<List<Integer>> resList = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) return resList;
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> layList = new LinkedList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                layList.add(temp.val);
            }
            resList.add(layList);   //107这里头结点插入
        }
        return resList;
    }

}
