package java.top.yousite.offer.array;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 */
public class PrintListFromTailToHead {
    //头指针插入
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode newH = null ; // 新链表的头指针
        ListNode head = listNode ; // 新链表的头指针
        while (head!=null){
            ListNode temp = head.next;
            head.next = newH;
            newH = head;
            head = temp;
        }
        ArrayList list = new ArrayList<>();
        while(newH!=null){
            list.add(newH.val);
            newH = newH.next;
        }
        return list;
    }
}
