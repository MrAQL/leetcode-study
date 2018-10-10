package main.java.top.yousite.leetcode.LinkList.esay;

public class deleteNode {
    /**
     * 237. 删除链表中的节点
     */
    public void deleteNode(ListNode node) {
        node.val= node.next.val;
        node.next = node.next.next;
    }
}
