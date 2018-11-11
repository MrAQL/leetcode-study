package java.top.yousite.leetcode.tree.middle;


import java.util.ArrayList;

public class AllPossibleFullBinaryTrees {
    /**
     * 894.所有可能的满二叉树
     */
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (N == 1 ) res.add(new TreeNode(0));
        for (int i = 1; i < N; i+=2) {
            for (TreeNode left : allPossibleFBT(i))
                for (TreeNode right :allPossibleFBT(N-i-1))
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    res.add(root);
        }
        return res;
    }
}
