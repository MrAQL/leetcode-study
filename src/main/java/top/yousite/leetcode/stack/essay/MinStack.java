package java.top.yousite.leetcode.stack.essay;

import java.util.Stack;

public class MinStack {
    /**
     * 155. 最小栈
     */

    private Stack<Integer> dateStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        dateStack =new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty()){  //最小栈为空时
            dateStack.push(x);
            minStack.push(x);
        }else{
            dateStack.push(x);
            if(minStack.peek()>=dateStack.peek())minStack.push(x);


        }
    }

    public void pop() {

        if(dateStack.peek().equals( minStack.peek())) { //不能用 == 比较
            minStack.pop();
        };
        dateStack.pop();

    }

    public int top() {
        return dateStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


}
