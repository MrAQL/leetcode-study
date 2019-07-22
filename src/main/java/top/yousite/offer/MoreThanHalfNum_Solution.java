package top.yousite.offer;

import java.util.Arrays;

public class MoreThanHalfNum_Solution {
    //数组中出现次数超过一半的数字
    //nlogn
    /*public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int mid= array[array.length/2];
        int count = 0;
        for(int k: array){
            if (k== mid)count++;
        }
        return count>array.length/2?mid:0;
    }*/

    //n
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length < 1){
            return 0;
        }

        int moreNum = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == moreNum) count++;
            else{
                count--;
            }

            if (count == 0){
                moreNum=array[i];
                count=1;
            }
        }

        int appearCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]== moreNum){
                appearCount++;
            }
        }
        return appearCount>array.length/2?moreNum:0;

    }

}
