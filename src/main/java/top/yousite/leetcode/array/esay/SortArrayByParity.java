package top.yousite.leetcode.array.esay;

public class SortArrayByParity {
	/**
	 * 905. 按奇偶校验排序数组
	 * @param A
	 * @return
	 */
	public int[] sortArrayByParity(int[] A) {
        int[] temp = new int[A.length];
        int index= 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2 == 0){
               temp[index++]=A[i];
                
            }
        }
        for(int i=0; i<A.length;i++){
           if(A[i]%2 != 0){
                temp[index++]=A[i];
            }
        }
        return temp;
    }
	
	///改进方法（左右索引，加多个右指针）
//	public int[] sortArrayByParity(int[] A) {
//        int a = A.length;
//        int[] result = new int[a];
//        int index1 = 0;
//        int index2 = a - 1;
//        for (int i = 0; i < A.length; i++) {
//            int c = A[i];
//            if (c % 2 == 0) {
//                result[index1] = c;
//                index1++;
//            } else {
//                result[index2] = c;
//                index2--;
//            }
//        }
}
