package java.top.yousite.leetcode.tree.essay;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTree {
    /**
     * 637. 二叉树的层平均值
     */

    /**
     * 输入:
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * 输出: [3, 14.5, 11]
     */
    //BFS
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        if (root ==null) return res;
        queue.offer(root);
        while (!queue.isEmpty()){
            Double rowSum = 0.0;
            int size = queue.size();
            for (int i =0;i<size;i++){
                TreeNode temp =queue.poll();
                rowSum+=temp.val;   //当前层的sum结果
                //存为下一层的节点
                if (temp.left!=null)
                    queue.offer(temp.left);
                if (temp.right!=null)
                    queue.offer(temp.right);
            }
            res.add(rowSum/size);

        }
        return res;

    }
}
