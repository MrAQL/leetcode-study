package main.java.top.yousite.leetcode.stack.essay;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues {
    /**
     * 225. 用队列实现栈
     */
    class MyStack {

        //思想：插入改变队列顺序

        Queue<Integer> queue;

        /** Initialize your data structure here. */
        public MyStack() {
            queue = new ArrayDeque();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
            for(int i=0;i<queue.size()-1;i++)  //size-1是为了到新增的放在队头（删除的一端）
            {
                queue.offer(queue.poll());
            }

        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue.poll();

        }

        /** Get the top element. */
        public int top() {
            return queue.peek();

        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

}
