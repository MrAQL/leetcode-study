package java.top.yousite.leetcode.tree.middle;

public class FindbottomLeftTreeValue {
    /**
     * 513.找树左下角的值
     */
    class Solution {
        int depth;
        int lastLeft;
        public int findBottomLeftValue(TreeNode root) {
            help(root,1);
            return lastLeft;
        }

        private void help(TreeNode root,int curDepth){
            if(root ==null) return ;
            if (curDepth >depth){           //当前深度 大于 最大深度
                depth = curDepth ;
                lastLeft  = root.val;
            }
            if(root.left != null){          //最左节点
                help(root.left,curDepth+1);
            }
            if(root.right != null){
                help(root.right,curDepth+1);
            }


        }

    }
}
