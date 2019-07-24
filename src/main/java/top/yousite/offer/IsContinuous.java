package top.yousite.offer;

import sun.font.FontRunIterator;

public class IsContinuous {
    //扑克牌顺子
    //max-min<=4,除了0其他只能出现1次（桶排序）
    public boolean isContinuous(int [] numbers) {
        int[] bucket = new int[14];
        int max = -1;
        int min = 14;
        if(numbers.length<5){
            return false;
        }

        for (int i = 0; i < numbers.length; i++) {
            bucket[numbers[i]]++;
            //为0的话不放入最小中
            if (numbers[i]==0){
                continue;
            }
            if (bucket[numbers[i]]>1 && numbers[i]!=0){
                return false;
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min= numbers[i];
            }
        }
        return max-min<=4;
    }
}
