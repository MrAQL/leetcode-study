package top.yousite.leetcode.array.esay;

public class PlusOne {
	/**
	 * 66. 加一
	 * */
	public int[] plusOne(int[] digits) {
        int length = digits.length;
        //判断数组的各个位是否为9，是的话变为0；否则+1
        for(int j =length-1 ;j>=0 ;j--){
            if(digits[j] == 9){
                digits[j] =0;
                
            }else{
                digits[j]+=1;
                return digits;
            }
        }
        //判断第一位是否为0；(由于： 数组中每个元素只存储一个数字。）
        //解决方法:用一个新的数组保存
             //只有全为9999这样才会出现这种情况，数组初始化时全为0
            int[] result=new int[digits.length+1];
            result[0]=1;
            return result;
        
    }

}
