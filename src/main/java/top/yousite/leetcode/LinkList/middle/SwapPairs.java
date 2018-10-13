package main.java.top.yousite.leetcode.LinkList.middle;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode newH = new ListNode(0) ;
        newH.next = head;
        ListNode p1=newH;
        ListNode p2=head;
        while(p1.next!=null&&p2.next!=null){
            p1.next=p2.next;
            p2.next=p2.next.next;
            p1.next.next=p2;
            p1=p2;
            p2=p2.next;
        }
        return newH.next;



    }
}
