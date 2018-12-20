package java.top.yousite.leetcode.LinkList.middle;

public class ReorderList {
    /**
     * 143. 重排链表
     */
    /**
     * 示例 1:
     *
     * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
     * 示例 2:
     *
     * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
     *
     */
    //思路:找到中间节点，反转后部分链表，两个链表合并
    public void reorderList(ListNode head) {
        //快慢指针找中间节点
        ListNode low = head;
        ListNode fast = head;
        while (fast.next != null &&fast.next.next !=null){
            low = low.next;
            fast= fast.next.next;
        }
        ListNode midHead = low.next; //后部分链表头
        low.next = null;
        ListNode M=rev(midHead);
        merge(head,M);
   }
    //链表反转
    private ListNode rev(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode newhead = rev(head.next);
        head.next.next = head;
        head.next= null;
        return newhead;
    }

    //链表合并
    private ListNode merge(ListNode head1,ListNode head2){
        if (head1 ==null) return head2;
        if (head2 == null) return head1;
        ListNode resHead = new ListNode(0);
        ListNode res = resHead;
        ListNode p1 = head1;
        ListNode p2 = head2;

        while (p1!=null && p2!=null){
            res.next = p1;
            res =res.next;
            p1=p1.next;
            res.next = p2;
            p2 = p2.next;
            res = res.next;
        }
        res.next = p1;
        return resHead.next;
    }
}
