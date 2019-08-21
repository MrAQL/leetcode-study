package top.yousite.leetcode.array.difficult;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    /**
     * 128. 最长连续序列
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int res = 0;
        for(int item : nums){
            if (!set.contains(item-1)){     //这步是精髓
                int tempCount = 1;
                while (set.contains(item+1)){
                    item+=1;
                    tempCount++;
                }
                res= Math.max(res,tempCount);

            }


        }
        return res;
    }
}
