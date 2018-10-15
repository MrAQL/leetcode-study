package main.java.top.yousite.leetcode.LinkList.middle;

public class OddEvenLinkedList {
    /**
     * 328. 奇偶链表
     * @param head
     * @return
     */

    /**
     * 思路:
     *
     *          p1    p2
     *          |      |
     *         [0] -> [1] -> [2] ->[3] ->[4]
     *          |      |
     *         p1h    p2h
     *        (新结点)
     *
     *        p1:奇  p1h:奇头指针
     *        p2:偶  p2h:偶头指针
     *
     */
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        };
        ListNode p1= head; ListNode p1h=head;
        ListNode p2= head.next; ListNode p2h=head.next;
        while(p2!=null && p2.next!=null){
            p1.next = p2.next;
            p1 = p2.next;
            p2.next=p1.next;
            p2 = p1.next;
        }
        p1.next = p2h;
        return p1h;

    }
}
