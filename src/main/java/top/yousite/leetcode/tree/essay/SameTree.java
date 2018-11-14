package java.top.yousite.leetcode.tree.essay;

import java.util.ArrayList;
import java.util.List;

public class SameTree {
    /**
     * 100.相同的树
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //不能遍历全部节点存在list中，比较2个list
        if (p==null && q==null) return true;
        if (p!=null && q!=null &&p.val == q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        return false;
    }


}
