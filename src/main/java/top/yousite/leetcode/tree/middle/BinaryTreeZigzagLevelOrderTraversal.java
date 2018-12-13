package java.top.yousite.leetcode.tree.middle;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    /**
     * 103. 二叉树的锯齿形层次遍历
     */
    /**
     * 例如：
     * 给定二叉树 [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回锯齿形层次遍历如下：
     *
     * [
     *   [3],
     *   [20,9],
     *   [15,7]
     * ]
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int count =1;   //计数(如果:
                        //   奇数:左-->右。偶数:右-->左)
        List<List<Integer>> res= new ArrayList<>();
        if (root ==null) return  res;
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> row = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null){
                    queue.offer(temp.left);
                }
                if (temp.right!=null){
                    queue.offer(temp.right);
                }
                if (count%2==0)     //反序
                {
                    row.add(0,temp.val);

                }
                if(count%2!=0){     //正序
                    row.add(temp.val);
                }
            }
            count++;    //层数+1
            res.add(row);
        }
        return res;
    }
}
