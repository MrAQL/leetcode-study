package top.yousite.leetcode.array.esay;

public class SortArrayByParityII {
    /**
     * 922. 按奇偶排序数组 II
     */
    //思路:找到 奇数不符合位 和 偶数不符合位 进行交换
    public int[] sortArrayByParityII(int[] A) {
        //奇数
        int p1=1;
        //偶数
        int p2=0;
        while (p1<A.length && p2<A.length){
            //找奇数位不符合的
            while (p1<A.length && (A[p1]%2)!=0){
                p1+=2;
            }
            //找偶数位不符合的
            while (p2<A.length&&(A[p2]%2)==0){
                p2+=2;
            }

            if(p1<A.length && p2<A.length){
                swap(A,p1,p2);
            }
        }
        return A;

    }

    private void swap(int[]A,int p,int q){
        int temp = A[p];
        A[p]=A[q];
        A[q]=temp;
    }
}
