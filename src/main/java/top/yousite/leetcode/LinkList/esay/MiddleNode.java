package main.java.top.yousite.leetcode.LinkList.esay;

public class MiddleNode {
    /**
     * 876. 链表的中间结点
     * @param head
     * @return
     */
     //快指针走2步，慢指针走1步.
     //快指针到终点时，慢指针为中间。
    public ListNode middleNode(ListNode head) {
        //快慢指针
        ListNode fast =head,low=head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
}
