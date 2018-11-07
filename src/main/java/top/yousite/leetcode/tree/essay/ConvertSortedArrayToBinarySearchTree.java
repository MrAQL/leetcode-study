package java.top.yousite.leetcode.tree.essay;

public class ConvertSortedArrayToBinarySearchTree {
    /**
     * 108. 将有序数组转换为二叉搜索树
     */

    /**
     * [-10,-3,0,5,9]
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     *
     *  根比左子树大，比右子树小
     **/
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length ==0) return null;
        return help(nums,0,nums.length-1);
    }

    private TreeNode help(int[]nums,int l,int r){
        if (l>r) return  null;
        //根
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums,l,mid-1);
        root.right = help(nums,mid+1,r);
        return root;
    }


}
