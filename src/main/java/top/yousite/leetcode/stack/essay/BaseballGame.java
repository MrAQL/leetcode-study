package main.java.top.yousite.leetcode.stack.essay;

import java.util.Stack;

public class BaseballGame {
    /**
     * 682. 棒球比赛
     */
    public int calPoints(String[] ops) {
        Stack<String> stack = new Stack<String>();
        for (String s :ops){
            if (s.equals("C")){

                stack.pop();

            }

            else if (s.equals("D")){

                String peek= stack.peek();
                stack.push(String.valueOf(Integer.valueOf(peek)*2));

            }

            else if (s.equals("+")){
                String pop =stack.pop();
                int two = Integer.valueOf(pop)+Integer.valueOf(stack.peek());
                stack.push(pop);
                stack.push(String.valueOf(two));
            }
            else
                stack.push(s);
        }

        int result =0;
        for (String str : stack){
            int i =Integer.valueOf(str);
            result+=i;

        }
        return result;
    }
}
