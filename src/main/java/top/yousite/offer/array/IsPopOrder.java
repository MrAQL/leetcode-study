package java.top.yousite.offer.array;

import java.util.Stack;

public class IsPopOrder {
    /**
     * 栈的压入，弹出序列
     */
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null) return false;
        if(popA.length!=pushA.length) return false;
        Stack<Integer> help = new Stack<Integer>();     //辅助栈
        int popIndex =0;
        for(int p : pushA){
            help.push(p);
            while(!help.isEmpty() && popA[popIndex] == help.peek()){
                help.pop();
                popIndex++;
            }
        }
        return help.isEmpty();
    }
}
