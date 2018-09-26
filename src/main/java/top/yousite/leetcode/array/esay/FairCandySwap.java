package top.yousite.leetcode.array.esay;

public class FairCandySwap {
	/**
	 * 888. 公平的糖果交换
	 */
	public int[] fairCandySwap(int[] A, int[] B) {
        //2个集合的差值的一半，等于2个数的差   //A:爱丽丝  B:鲍勃拥
        int sumA= getSum(A);       
        int sumB= getSum(B);
        if(sumA > sumB){
           int sumAve = (sumA-sumB)/2;
           for(int i =0 ; i<A.length; i++){
               for(int j =0 ; j<B.length; j++){
                   if(A[i] - B[j] == sumAve){
                       return new int[]{ A[i] , B[j] };
                   }
               }
           }
        }else{
           int sumAve = -(sumA-sumB)/2;
           for(int i =0 ; i<A.length; i++){
               for(int j =0 ; j<B.length; j++){
                   if(B[j] - A[i] == sumAve){
                       return new int[]{ A[i] , B[j] };
                   }
               }
           }
        }
        return null;
        
    }
    
    public int getSum(int[] array){
        int sum =0;
        for( int i =0; i <array.length;i++){
            sum +=array[i];
        }
        return sum;
    }
}
