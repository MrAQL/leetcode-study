package top.yousite.offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianInDataStream {
    //数据流中的中位数(堆，奇大根堆，偶小根堆)
    public class Solution {
        int count=0;
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(15,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        public void Insert(Integer num) {
            count++;
            //奇数
            if (count%2!=0){
                minQ.offer(num);
                int temp = minQ.poll();
                maxQ.offer(temp);
            }else{
                maxQ.offer(num);
                int temp = maxQ.poll();
                minQ.offer(temp);
            }

        }

        public Double GetMedian() {
            //偶数
            if (count%2==0){
                return new Double(maxQ.peek()+minQ.peek())/2;
            }else{
                return new Double(maxQ.peek());
            }
        }
    }
}
