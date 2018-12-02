package java.top.yousite.leetcode.tree.middle;

import java.util.LinkedList;
import java.util.Queue;

public class SumRootToLeafNumbers {
    /**
     * 129. 求根到叶子节点数字之和
     */
    /**
     * 输入: [1,2,3]
     *     1
     *    / \
     *   2   3
     * 输出: 25
     */
    //DFS
    /*public int sumNumbers(TreeNode root) {
        if(root == null )return 0;
        return dfs(root,0);
    }
    private int dfs(TreeNode root,int res){
        if(root== null) return 0;
        if(root.left == null && root.right ==null){
            return res*10+root.val;
        }
        return dfs(root.left,res*10+root.val)+dfs(root.right,res*10+root.val);
    }*/

    //BFS(思路就是改变叶子节点的值，再把叶子相加)
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left == null && temp.right == null){
                    sum+=temp.val;      //到叶子了
                }
                if (temp.left!=null){
                    temp.left.val += temp.val*10;   //改变节点值
                    queue.offer(temp.left);

                }
                if (temp.right!=null){
                    temp.right.val += temp.val*10;  //改变节点值
                    queue.offer(temp.right);
                }
            }
        }
        return sum;
    }







}
