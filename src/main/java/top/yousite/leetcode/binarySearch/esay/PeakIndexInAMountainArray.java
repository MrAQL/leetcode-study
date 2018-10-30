package java.top.yousite.leetcode.binarySearch.esay;

public class PeakIndexInAMountainArray {
    /**
     * 852. 山脉数组的峰顶索引
     */

    /**
     *思路：存在一个 i，使得 A[j-1]<A[j]&&A[j]>A[j+1]
     */

    //solve-1:暴力直接找i
    /*public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        for (int j = 1; j < A.length; j++) {
            if (A[j-1]<A[j]&&A[j]>A[j+1]){
                i =j;
                break;
            }
        }
            return i;
    }*/

    //solve-2:二分法找中间位
    public int peakIndexInMountainArray(int[] A) {
        int low =0;
        int hig =A.length-1;
        int middle= 0 ;
        while (low<=hig){
            middle = (low+hig)/2;
            if(middle==0||middle==A.length-1){  //极端情况，mid移动到最左 或 最右
                break;
            }
            if (A[middle-1]<A[middle]&&A[middle]>A[middle+1]){
                return middle;
            }
            if (A[middle-1]>A[middle]&&A[middle]>A[middle+1]){
                hig= middle-1;
            }else { low = middle+1;};
        }
        return middle;
    }

}
