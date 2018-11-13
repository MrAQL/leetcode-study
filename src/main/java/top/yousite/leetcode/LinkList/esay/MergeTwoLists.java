package java.top.yousite.leetcode.LinkList.esay;

public class MergeTwoLists {
    /**
     * 21.合并两个有序链表
     */

    /**
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    /*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //递归实现
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if(l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }*/

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //非递归
        if (l1 ==null) return l2;
        if (l2 ==null) return l1;
        if (l1 == null&&l2 == null) return null;
        ListNode resH = new ListNode(0);    //结果节点头指针
        ListNode res = resH;

        while (l1!=null &&l2!=null){
            if (l1.val<=l2.val){
                res.next = l1;
                l1=l1.next;
            }else{
                res.next = l2;
                l2=l2.next;
            }
            res =res.next; //移动结果指针
        }

        //一个节点已经为空，直接插入到结果指针

        if (l1 == null){
            res.next = l2;
        }
        if (l2 == null){
            res.next = l1;
        }

        return resH.next;
    }
}
