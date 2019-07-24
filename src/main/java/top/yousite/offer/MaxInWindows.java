package top.yousite.offer;


import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;

public class MaxInWindows {
    //滑动窗口的最大值(双端队列)
    //   头【（大数index）........】尾      头存大数index
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res =new ArrayList<Integer>();
        if (num==null ||  num.length<=0|| num.length <size || size<=0) {
            return res;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {
            if (!deque.isEmpty()){
                //判断大的是否到头了
                if (deque.peek()+size<=i){
                    deque.pollFirst();
                }

                //清除小的
                while (!deque.isEmpty() && num[deque.peekLast()]<= num[i]){
                    deque.pollLast();
                }
            }
            deque.offer(i);
            if (i+1>=size){
                res.add(num[deque.peek()]);
            }
        }
        return res;

    }






}
