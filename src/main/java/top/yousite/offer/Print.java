package top.yousite.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
    //把二叉树打印成多行
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(pRoot);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                row.add(temp.val);
                if (temp.left!=null){
                    queue.offer(temp.left);
                }
                if (temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            res.add(row);
        }
        return res;

    }
}
