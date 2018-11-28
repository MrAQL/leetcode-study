package java.top.yousite.offer.array;

public class Merge {
    /**
     * 有序链表合并
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        //有序链表合并      ------递增
        //if(list1==null && list2==null) return null;
        /*if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1 == null && list2==null) return null;
        if(list1.val<list2.val){
            list1.next=Merge(list1.next,list2);
            return list1;
        }
        else{
            list2.next=Merge(list1,list2.next);
            return list2;
        }*/


        //非递归    ---单调递增
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1 == null && list2==null) return null;
        ListNode resH = new ListNode(0);
        ListNode cur = resH;
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                cur.next= list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur=cur.next;    //这步不要忘记了.....
        }
        if(list2 == null){
            cur.next = list1;
        }
        else if(list1 == null){
            cur.next = list2;
        }

        return resH.next;
    }
}
