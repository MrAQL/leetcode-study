package java.top.yousite.leetcode.twopoint.essay;

public class FirstBadVersion {
    /**
     * 278. 第一个错误的版本
     */
    /**
     *
     * 给定 n = 5，并且 version = 4 是第一个错误的版本。
     *
     * 调用 isBadVersion(3) -> false
     * 调用 isBadVersion(5) -> true
     * 调用 isBadVersion(4) -> true
     *
     * 所以，4 是第一个错误的版本。
     *
     */
    public int firstBadVersion(int n) {
        //二分查找（双指针）
        int left = 1;
        int right = n;
        while (left<right){
            int mid = left+(right-left)/2;
            if (isBadVersion(mid)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;

    }
}
