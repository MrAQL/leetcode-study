package main.java.top.yousite.leetcode.LinkList.middle;

public class PartitionList {
    /**
     * 86. 分隔链表
     */
    public ListNode partition(ListNode head, int x) {
        ListNode p1h = new ListNode(0);      //save big number ,p1的头指针
        ListNode p2h = new ListNode(0);      //save small number ,p2的头指针
        ListNode p1 = p1h;      //当前指针
        ListNode p2 = p2h;

        while (head!=null){
            if (head.val >= x){
                p1.next = head;
                p1 = p1.next;
                head = head.next;
            }else {
                p2.next = head;
                p2 = p2.next;
                head = head.next;

            }
        }
        p1.next = null;     //没有等于null的话会超时
        p2.next = p1h.next;
        return  p2h.next;
    }
}
