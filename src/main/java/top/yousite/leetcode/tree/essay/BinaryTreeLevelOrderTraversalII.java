package java.top.yousite.leetcode.tree.essay;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    /**
     * 107.二叉树的层次遍历 II
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //bfs（广度优先遍历）
        //用一个队列 节点 存每层节点，如果该层全部遍历完，队列就只有下层的
        List<List<Integer>> res = new LinkedList<>();
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        if (root ==null) return res;
        queue.offer(root);          //入队
        while (!queue.isEmpty()){
            List<Integer> layRes  = new LinkedList<>();  //保存每一层的数
            int size = queue.size();
            for (int i =0;i<size;i++){
                TreeNode temp =queue.poll();    //出队
                layRes.add(temp.val);
                if (temp.left!=null)
                    queue.offer(temp.left);
                if (temp.right!=null)
                    queue.offer(temp.right);
            }
            res.add(0,layRes);  //头插法（实现逆序）
        }
        return res;
    }


}
