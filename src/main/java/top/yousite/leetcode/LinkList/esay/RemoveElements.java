package java.top.yousite.leetcode.LinkList.esay;

public class RemoveElements {
    /**
     * 203. 移除链表元素
     */
    /**
     * 注意:要用多一个头指针，不然第一个元素删不掉
     */
    public ListNode removeElements(ListNode head, int val) {
        //要[6,6] 6 测试用例，用多个头指针，不然无法删除第一个
        if(head== null) return head;
        ListNode resH =new ListNode(-18);
        resH.next = head;
        ListNode cur = resH;
        while(cur.next!=null){
            if(cur.next.val!=val){
                cur= cur.next;
            }else{
                cur.next = cur.next.next;   //负责指向下一个就行，不要移动cur指针
                //cur=cur.next;
            }
        }
        return resH.next;
    }
}
