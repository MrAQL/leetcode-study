package top.yousite.leetcode.array.middle;

public class SearchRange {
    /**
     * 34. 在排序数组中查找元素的第一个和最后一个位置
     */
    //找到 target ，然后 左右前进
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int l = 0 ;
        int r = nums.length-1;
        while (l<r){
            int mid= l +(r-l)/2;
            if (nums[mid] < target){
                l = mid+1;
            }else if(nums[mid] > target){
                r = mid-1;
            }else{
                int ll = mid;
                int rr = mid;
                while (nums[ll] == target){
                    ll--;
                }
                while (nums[rr] == target){
                    rr++;
                }
                res[0] = ll;
                res[1] = rr;
                break;
            }

        }

        return res;
    }
}
