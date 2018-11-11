package java.top.yousite.leetcode.tree.middle;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {
    /**
     * 515.在每个树行中找最大值
     */
        /**
         * 输入:
         *
         *           1
         *          / \
         *         3   2
         *        / \   \
         *       5   3   9
         *
         * 输出: [1, 3, 9]
         */
        public List<Integer> largestValues(TreeNode root) {
            //BFS
            List<Integer> resList = new ArrayList<Integer>();
            if (root == null) return resList;
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.offer(root);
            while (!queue.isEmpty()){
                int rowMax = Integer.MIN_VALUE;  //rowMax初始化为最小值
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    if (temp.left!=null)queue.offer(temp.left);
                    if (temp.right!=null)queue.offer(temp.right);
                    if (temp.val > rowMax) rowMax=temp.val;  //行最大的才放入
                }
                resList.add(rowMax);
            }
                return resList;

        }

}
