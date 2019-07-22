package top.yousite.offer;

public class EntryNodeOfLoop {
    //链表中环的入口结点
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        //1.快慢指针找到中间节点
        //2.慢节点复位（头节点），快慢指针走一步，相遇即入口节点
        if (pHead == null) return null;
        ListNode low = pHead;
        ListNode fast = pHead;
        while (fast.next!=null ||fast.next.next!=null){
            low=low.next;
            fast=fast.next.next;
            if (low==fast){
                low=pHead;
                while (low!=fast){
                    fast=fast.next;
                    low=low.next;
                }
                return low;
            }
        }
        return null;
    }
}
