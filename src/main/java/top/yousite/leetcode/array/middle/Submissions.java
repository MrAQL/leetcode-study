package java.top.yousite.leetcode.array.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Submissions {
    /**
     * 442. 数组中重复的数据
     */
    public List<Integer> findDuplicates(int[] nums) {
        //遍历过就取下标负，当下一次遍历到为负时就加入到结果中
        //**(不能取正加入，因为有些数可能不在，例如本题的5，那么5号位一直为正)

        //法一:（高效） time:o(n), space(o(1))
        /*List<Integer> res = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            //先判断下标是否为负
            if(nums[Math.abs(nums[i])-1]<0){
                res.add(Math.abs(nums[i]));
            }
            nums[Math.abs(nums[i])-1]*=-1;  //对应数字的下标-1变负
        }

        return res;*/

        //法二(暴力) time:o(n), space(o(1))
        List<Integer> res = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();     //value,count
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){   //通过哈希表getKey
                map.put(Integer.valueOf(nums[i]),"随便填");
            }
            else{
                res.add(nums[i]);
                //map.put(nums[i],++map.get(nums[i]));
            }
        }
        return res;

    }
}
