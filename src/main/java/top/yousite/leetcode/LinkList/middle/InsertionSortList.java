package java.top.yousite.leetcode.LinkList.middle;

import java.util.List;

public class InsertionSortList {
    /**
     *147.对链表进行插入排序
     */
    public ListNode insertionSortList(ListNode head) {
        if(head ==null ||head.next ==null) return head;
        ListNode p1= head.next;
        ListNode hp = head;
        while (p1!=null){
            if (p1.val>=hp.val){
                hp = hp.next;
                p1=p1.next;
            }else{
                //插入到第一位
                if(p1.val<=head.val){
                    ListNode temp = p1.next;
                    hp.next = p1.next;
                    p1.next = head;
                    head=p1;
                    p1=temp;
                }else{
                    //不插入到头节点，这步有点绕...
                    ListNode tempH = head;  //tempH的待插入节点的前一位
                    while (tempH.next.val<p1.val){
                        tempH=tempH.next;
                    }
                    ListNode t = p1.next;   //t为下次循环时，p1的位置
                    hp.next = p1.next;
                    p1.next = tempH.next;
                    tempH.next = p1;
                    p1 = t;
                }
            }
        }
        return head;
    }
}
