package top.yousite.offer;

public class FindFirstCommonNode {
    //两个链表的第一个公共结点
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null){
            return null;
        }
        int p1size = getListNodeSize(pHead1);
        int p2size = getListNodeSize(pHead2);
        if (p1size==p2size){
            return pHead1;
        }else if (p1size>p2size){
            for (int i = 0; i < p1size-p2size; i++) {
                pHead1 = pHead1.next;
            }
        }else{
            for (int i = 0; i < p2size-p1size; i++) {
                pHead2 = pHead2.next;
            }
        }
        while (pHead1!=pHead2){
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return pHead1;




    }

    private int getListNodeSize(ListNode listNode){
        if (listNode == null){
            return 0;
        }
        int count = 0;
        while (listNode!=null){
            count++;
            listNode=listNode.next;
        }
        return count;
    }
}
