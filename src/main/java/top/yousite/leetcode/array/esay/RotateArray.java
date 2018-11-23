package java.top.yousite.leetcode.array.esay;

public class RotateArray {
    /**
     * 189. 旋转数组
     */
    public void rotate(int[] nums, int k) {
        //法一(把后面的存起来，前面的移动到后面，后面的覆盖到前面)
        k=k%nums.length;    //防止k大于nums.length时，出错;
        int[] temp = new int[k];
        int index = 0;
        for(int i = nums.length-k ;i<nums.length;i++){
            temp[index++] = nums[i];
        }
        for(int i = nums.length-1-k;i>-1;i--){
            nums[i+k] =nums[i];
        }

        for(int i =0 ;i<k;i++){
            nums[i] = temp[i];
        }



    }
    /*public void rotate(int[] nums, int k) {
    //法二（经典的三次反转）参考字符串反转
        if(k>nums.length)k%=nums.length;
        rev(nums,0,nums.length-k-1);
        rev(nums,nums.length-k,nums.length-1);
        rev(nums,0,nums.length-1);}
    private void rev(int[]nums,int l,int r){
        while(l<=r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r]= temp;
            l++;
            r--;
        }

    }*/
}
