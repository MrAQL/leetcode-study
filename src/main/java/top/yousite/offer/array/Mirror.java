package java.top.yousite.offer.array;

public class Mirror {
    /**
     * 二叉树的镜像
     */
    //简单题
    public void Mirror(TreeNode root) {
        //自顶向下
        if(root == null) return;
                                //这里不用判断左右是否空
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null){
            Mirror(root.left);
        }

        if(root.right!=null){
            Mirror(root.right);
        }
    }
}
