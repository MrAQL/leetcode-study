package java.top.yousite.offer.array;

public class HasSubtree {
    /**
     * 树的子结构
     */
    /***
     * 输入两棵二叉树A，B，判断B是不是A的子结构。
     * （ps：我们约定空树不是任意一个树的子结构）
     *
     */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if (root1 != null && root2!=null){
            if (root1.val == root2.val){
                res = help(root1,root2);
            }
            if (res!= true){
                res = help(root1.left,root2);
            }
            if (res!= true){
                res = help(root1.right,root2);
            }
        }
        return res;
    }

    /**
     *
     * @param root1     主树
     * @param root2     子树
     * @return
     */
    private boolean help(TreeNode root1 ,TreeNode root2){
        //要先判断root2节点是否空
        if (root2 == null) return true;

        if (root1 == null) return false;

        if (root1.val!=root2.val) return false;
        //根节点相等，在比较左右子树
        return help(root1.left,root2.left) && help(root1.right,root2.right);

    }
}
