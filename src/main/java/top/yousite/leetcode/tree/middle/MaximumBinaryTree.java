package java.top.yousite.leetcode.tree.middle;

public class MaximumBinaryTree {
    /**
     * 654. 最大二叉树
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return help(nums,0,nums.length);
    }

    /**
     *  递归生成二叉树
     * @param nums
     * @param l 左索引
     * @param r 右索引
     *
     */
    private TreeNode help(int nums[],int l,int r){
        if (l>=r)return null;   //等于相当都指向根
        int max = l ;
        //获取最大的树，做根节点
        for (int i = l+1; i < r; i++) {
            if (nums[max]<nums[i]){max = i ;}
        }
        TreeNode root = new TreeNode(nums[max]);
        //左子树（递归左边<-（相对于根）,得到最大的数，成为左根）
        root.left = help(nums,l,max);
        //右子树（递归右边<-（相对于根）,得到最大的数，成为右根）
        root.right = help(nums,max+1,r);
        return root;
    }
}
