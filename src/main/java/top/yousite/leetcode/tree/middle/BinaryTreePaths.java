package java.top.yousite.leetcode.tree.middle;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    /**
     * 257.二叉树的所有路径
     */
        /**
         *  输入:
         *
         *     1
         *    / \
         *   2   3
         *   \
         *    5
         *
         *  输出: ["1->2->5", "1->3"]  //先序遍历
         */

    public List<String> binaryTreePaths(TreeNode root) {
        //dfs
        List<String> res = new ArrayList<>();
        dfs(root,res,"");
        return res;

    }
    private void dfs(TreeNode root,List<String> list,String str){
        if (root == null) return;
        if (root.left == null && root.right == null){   //递归结束条件(最后一层)
            str+=root.val;  //str+最后一层的值
            list.add(str);
        }
        dfs(root.left,list,str+root.val+"->");
        dfs(root.right,list,str+root.val+"->");
    }
}
