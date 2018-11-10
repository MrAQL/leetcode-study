package java.top.yousite.leetcode.tree.essay;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class NAryTreeLevelOrderTraversal {
    /**
     * 429.N叉树的层序遍历
     */

    public List<List<Integer>> levelOrder(Node root) {
        //bfs（与二叉树bfs遍历一样，即102,107一样）
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        if (root == null) return res;
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> layList = new ArrayList<>();
            int size = queue.size();    //当前层节点个数
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                for (int j = 0; j < temp.children.size(); j++) {
                    //加入到 下层 的节点
                    if (temp.children.get(j)!=null) queue.offer(temp.children.get(j));
                }
                layList.add(temp.val);
            }
            res.add(layList);
        }
        return res;
    }

}
