package java.top.yousite.leetcode.tree.middle;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    /**
     * 105. 从前序与中序遍历序列构造二叉树
     */
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return dfs(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    private TreeNode dfs(int[] preorder, int[] inorder,int preL,int preR,int inoL,int inoR){
        if(preL> preR || inoL>inoR) return null;
        TreeNode root = new TreeNode(preorder[preL]);
        int inoIndex= map.get(preorder[preL]);
        int ino_left_number = inoIndex-inoL;    //中序左边节点个数
        root.left = dfs(preorder,inorder,preL+1,preL+ino_left_number,inoL,inoIndex-1);
        root.right = dfs(preorder, inorder,preL+ino_left_number+1,preR,inoIndex+1,inoR);
        return root;

    }
}
