package java.top.yousite.leetcode.tree.middle;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    /**
     * 106. 从中序与后序遍历序列构造二叉树
     */

    /**
     * 中序遍历 inorder = [9,3,15,20,7]
     * 后序遍历 postorder = [9,15,7,20,3]
     */
    //找到中序中对应的位置
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return dfs(inorder,postorder,0,inorder.length-1,0,postorder.length-1);

    }

    private TreeNode dfs(int[] inorder, int[] postorder,int il,int ir,int pl,int pr){
        if(il > ir ||  pl> pr) return null;
        int rootIndex = pr;
        TreeNode root = new TreeNode(postorder[pr]);
        //找到 中序中 对应的位置
        int inoIndex = map.get(postorder[pr]);
        int in_left_num = inoIndex-il; //中序左节点数目 (关键点)
        root.left = dfs(inorder,postorder,il,inoIndex-1,pl,pl+in_left_num-1);
        root.right = dfs(inorder,postorder,inoIndex+1,ir,pl + (inoIndex - il),pr-1);
        return root;
    }
}
