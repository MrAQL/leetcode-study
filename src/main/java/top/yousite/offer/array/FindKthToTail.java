package java.top.yousite.offer.array;

public class FindKthToTail {
    /**
     * 链表倒数第k个节点
     */
    //鲁棒性
    public ListNode FindKthToTail(ListNode head,int k) {
        //双指针
        if(head==null ||k<0) return head;
        if(k==0) return null;
        ListNode p1 =head;
        ListNode res =head;
        for(int i=0;i<k-1;i++){
            if(p1.next!=null){    //防止k>链表长度
                p1=p1.next;
            }else{
                return null;
            }

        }
        while(p1.next!=null){
            p1=p1.next;
            res=res.next;
        }
        return res;
    }
}
