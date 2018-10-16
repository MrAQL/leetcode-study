package main.java.top.yousite.leetcode.LinkList.esay;

import java.util.HashSet;

public class HasCycle {
    /**
     * 141. 环形链表(判断链表中是否有环)
     */
    /**
     *思路:
     *  1:哈希表
     *  2:双指针(fast :move 2, low :move 1,) 如果fast指针与low指针相遇，则有环
     */

    /**
     * solve -1
     * @param head
     * @return
     */
    /*public boolean HasCycle(ListNode head) {
        HashSet set = new HashSet();
        while (head!=null){
            if (set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }*/

    /**
     * solve -2
     */
    public boolean hasCycle(ListNode head) {
        if(head == null)return false;
        if(head.next == null)return false;
        if(head.next.next == null)return false;
        ListNode fast = head.next;
        ListNode low = head;
        while (low!=fast){

            if(fast== null || fast.next == null){
                return false;
            }
            fast= fast.next.next;
            low = low.next;
        }
        return  true;

    }
}
