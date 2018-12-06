package java.top.yousite.leetcode.LinkList.esay;

import java.util.Stack;

public class PalindromeLinkedList {
    /**
     * 234. 回文链表
     */
    public boolean isPalindrome(ListNode head) {
        //1.暴力(o(n) space)，全进栈
        /*Boolean flag = true;
        if (head == null) return true;
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while (cur!=null){
            stack.push(cur);
            cur= cur.next;
        }
        while (head!=null){
            if (head.val != stack.pop().val){
                flag= false;
            }
            head = head.next;
        }
            return flag;*/


        //2.找到中间节点，一半进栈，比较栈与前部分
        /*Stack<ListNode> stack = new Stack<ListNode>();
        ListNode low = head;
        ListNode fast = head;
        while(fast != null &&fast.next!=null){
            stack.push(low);
            fast= fast.next.next;
            low=low.next;
        }
        //奇数长 1 - > 2 -> 1  (栈中原始为1，把 low指针 从 2移动到1)
        if(fast!= null){
            low = low.next;
        }
        while(low!=null){
            if(low.val != stack.pop().val)return false;
            low = low.next;
        }
        return true;*/

        //3.快慢指针找到中点，后部分反转，然后进行对比
        if (head == null) return true;
        ListNode mid = getMid(head);
        ListNode temp  = revLink(mid);
        while (head!=mid){
            if (head.val != temp.val){
                return false;
            }
            head = head.next;
            temp = temp.next;
        }
        return true;


    }

    //找中间节点
    private ListNode getMid(ListNode head){
        //快慢指针
        ListNode low = head;
        ListNode fast = head;
        while (fast != null &&fast.next!=null){
            low=low.next;
            fast= fast.next.next;
        }
        return low;
    }

    //反转链表
    private ListNode revLink(ListNode head){
        if(head== null ||head.next ==null){
            return head;
        }
        ListNode newH= null;
        newH = revLink(head.next);
        head.next.next = head;
        head.next = null;
        return newH;

    }
}
