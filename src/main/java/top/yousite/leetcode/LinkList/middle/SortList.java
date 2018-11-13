package java.top.yousite.leetcode.LinkList.middle;

public class SortList {
    /**
     * 148.排序链表
     */
    public ListNode sortList(ListNode head) {
        //归并
        //1.找到中间节点(快慢指针)
        //2.归(规模变小)
        //3.并(链表合并)
        if(head == null || head.next == null) return head;
        //快慢指针找中间节点
        ListNode low = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){  //要灵活判断边界条件
            low = low.next;
            fast = fast.next.next;
        }
        //中间指针
        //链表分为2半
        fast = low.next;
        low.next =null;

        return meger(sortList(head),sortList(fast)); //归并

    }

    //链表合并
    private ListNode meger(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val<l2.val){
            l1.next = meger(l1.next,l2);
            return l1;
        }else{
            l2.next = meger(l1,l2.next);
            return l2;
        }
    }
}
