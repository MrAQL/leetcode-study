package top.yousite.offer;

public class FindNumsAppearOnce {
    //数组中只出现一次的数字
    /**
     * 思路：异或，出现1的位置i记下，
     * 重新遍历判断的i位是否为1，是的话丢一边，不是就丟另外一边
     *
     */
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int bit =0;
        for (int i = 0; i < array.length; i++) {
            bit^=array[i];
        }
        int fisrIndex=findFirstOne(bit);
        for (int i = 0; i <array.length; i++) {
            if (checkIfOne(array[i],fisrIndex)){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];
            }
        }
    }

    //找到第一位1
    private int findFirstOne(int bit){
        int count = 0;
        while ((bit&1)==0){
            bit= bit>>>1;
            count++;
        }
        return count;
    }

    //检查第i位是否为1
    private boolean checkIfOne(int num,int index){
        while (index>0){
            num=num>>1;
            index--;
        }
        return ((num&1) ==1 )?true:false;
    }
}
