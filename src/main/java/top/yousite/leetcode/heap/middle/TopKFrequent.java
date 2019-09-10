package top.yousite.leetcode.heap.middle;
import java.awt.image.Kernel;
import java.util.*;
public class TopKFrequent {
    /**
     * 347. 前K个高频元素
     */
    //思路:记录词频，小根堆，与 前n大数 解法类似。
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> min = new PriorityQueue<>((o1, o2) -> map.get(o1)-map.get(o2));
        List<Integer> res = new LinkedList<>();

        //记录频率
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        //遍历map存入堆中
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            if (min.size()<k){
                min.add(it.next().getKey());
            }else{
                //
                Map.Entry<Integer, Integer> entry = it.next();
                int rate= entry.getValue();
                Integer pek = map.get(min.peek());
                if (pek<rate){
                    min.poll();
                    min.offer(entry.getKey());
                }
            }
        }

        while (!min.isEmpty()){
            ((LinkedList<Integer>) res).addFirst(min.poll());
        }
        return res;
    }
}
