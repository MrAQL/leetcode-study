package main.java.top.yousite.leetcode.stack.essay;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaseballGame {
    /**
     * 682. 棒球比赛
     */
    //solve-1:stack
    /*public int calPoints(String[] ops) {
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
    }*/


    //solve-2:array
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        int allScore =0;
        for (String s:ops){
            if (s.equals("C")){
                list.remove(list.size() -1);
            }
            else if (s.equals("D")){
                int lastScore= list.get(list.size()-1);
                list.add(lastScore * 2);
            }
            else if (s.equals("+")){
                int lastScore= list.get(list.size()-1);
                int last_Second_Score= list.get(list.size()-2);
                list.add(lastScore+last_Second_Score);
            }else {
                list.add(Integer.valueOf(s));
            }

        }

        for (int i:list){
            allScore+=i;
        }
        return allScore;

    }
}
