package top.yousite.offer;

public class GetNumberOfK {
    //数字在排序数组中出现的次数
    //二分(找最左匹配和最右匹配)
    public int GetNumberOfK(int [] array , int k) {
        if (array.length==0) {
            return 0; }
        int l = findLeftestIndex(array,k);
        int r = findRightestIndex(array,k);
        //-1是为了防止查询k不存在这个数组中时，+1出错
        return (l!=-1 && r!=-1)?(r-l+1):0;
    }

    private int findLeftestIndex(int [] array , int k){
        int l =0;
        int r = array.length-1;
        int mid=l+(r-l)/2;
        while (l<=r){
            if (array[mid]<k){
                l=mid+1;
            }
            else if (array[mid]>k){
                r=mid-1;
            }
            else if (mid-1>=0 && array[mid-1]==k){
                r=mid-1;
            }else{
                return mid;
            }
            mid = l+(r-l)/2;
        }
        return -1;

    }
    private int findRightestIndex(int [] array , int k){
        int l =0;
        int r = array.length-1;
        int mid=l+(r-l)/2;
        while (l<=r){
            if (array[mid]<k){
                l=mid+1;
            }
            else if (array[mid]>k){
                r=mid-1;
            }
            else if (mid+1<array.length && array[mid+1]==k){
                l=mid+1;
            }else{
                return mid;
            }
            mid = l+(r-l)/2;
        }
        return -1;
    }
}
