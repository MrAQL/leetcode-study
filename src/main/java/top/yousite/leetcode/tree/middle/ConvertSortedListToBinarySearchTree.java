package java.top.yousite.leetcode.tree.middle;

public class ConvertSortedListToBinarySearchTree {
    /**
     * 109.有序链表转换二叉搜索树
     */
    /**
     * 给定的有序链表： [-10, -3, 0, 5, 9],
     *
     * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
     *
     *       0
     *      / \
     *    -3   9
     *    /   /
     *  -10  5
     */
    //有序链表，
    // 左子树，头--> mid节点
    // 右子数  mid节点--> 尾节点
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode t= new TreeNode();
        t= dfs(head,t);
        return t;
    }
    private TreeNode dfs(ListNode node,TreeNode root){
        if (node == null || root == null) return root;
        ListNode mid= getMiddle(node);
        root= new TreeNode(mid.val);
        root.left=dfs(getMiddle(node),root.left);
        root.right=dfs(getMiddle(node),root.right);
        return root;
    }

    private ListNode getMiddle(ListNode head){
        ListNode fast = head;
        ListNode low = head;
        while (fast.next!=null || fast.next.next!=null){
            fast= fast.next.next;
            low = low.next;
        }
        return low;

    }
}
