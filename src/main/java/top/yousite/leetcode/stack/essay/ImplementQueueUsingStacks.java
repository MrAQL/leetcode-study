package main.java.top.yousite.leetcode.stack.essay;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    /**
     * 232. 用栈实现队列
     */

    class MyQueue {
        private Stack<Integer> stack_s1;
        private Stack<Integer> stack_s2;


        /** Initialize your data structure here. */
        public MyQueue() {
            stack_s1 = new Stack();
            stack_s2 = new Stack();

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stack_s1.push(x);

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (stack_s2.isEmpty()) {
                while (!stack_s1.isEmpty()) {
                    stack_s2.push(stack_s1.pop());
                }

            }
            return stack_s2.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (stack_s2.isEmpty()){
                while (!stack_s1.isEmpty()){
                    stack_s2.push(stack_s1.pop());
                }
            }
            return stack_s2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {

            return stack_s2.isEmpty() && stack_s1.isEmpty();
        }
    }
}
