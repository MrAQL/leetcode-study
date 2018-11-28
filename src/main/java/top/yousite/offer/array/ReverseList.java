package java.top.yousite.offer.array;

public class ReverseList {
    /**
     * 反转链表
     */
    public ListNode ReverseList(ListNode head) {
        //递归反转
        if(head==null || head.next==null) return head;
        ListNode newHead = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
