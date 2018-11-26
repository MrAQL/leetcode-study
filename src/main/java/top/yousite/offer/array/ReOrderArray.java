package java.top.yousite.offer.array;

public class ReOrderArray {
    /**
     * 	调整数组顺序使奇数位于偶数前面
     */
     //是奇数不是奇数位
    public void reOrderArray(int [] array) {
        if (array.length==1) return;    //只有1个是数组会爆
        int[] temp=new int[array.length/2];    //存偶数位
        int tempIndex=0;
        int index=0;
        for(int i=0;i<array.length;i++){
            //偶数位
            if(array[i]%2==0){
                temp[tempIndex++]=array[i];
            }
            //移动奇数位
            else{
                array[index++]= array[i];
            }
        }
        //奇数长度一定大于或等于偶数位
        int t=0;
        //（array长度1时，会爆） **注意
        for(int i = array.length-temp.length;i<array.length;i++){
            array[i]=temp[t++];
        }
    }
}
