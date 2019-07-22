package top.yousite.offer;

public class DeleteDuplication {
    //删除链表中重复的结点
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null){
            return pHead;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next=pHead;
        ListNode p = newHead;
        while (p.next!=null){
            if (p.next.next!=null && p.next.val == p.next.next.val){
                int tempVal= p.next.val;    //暂存相同的元素
                //去掉相同的
                while (p.next!=null && p.next.val == tempVal){
                    p.next=p.next.next;
                }
            }else{
                p=p.next;   //p.next != p.next.next，p才走
            }
        }
        return newHead.next;

    }



















    /**
     * 输入：{1,2,3,3,4,4,5}
     * 输出：{1,2,3,4,5}
     */
    /*public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null){
            return pHead;
        }
        ListNode newHead= new ListNode(-1);
        ListNode res= newHead;
        newHead.next=pHead;
        while (pHead!=null){
            if(newHead.val!=pHead.val){
                newHead.next=pHead;
                newHead = pHead;
                pHead=pHead.next;
            }else{
                pHead=pHead.next;
            }
        }
        return res.next;
    }*/
}
