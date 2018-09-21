package top.yousite.offer.array;
/**
 * 剑指offer
 * 二维数组中的查找
 * @author jam
 *
 */
public class FindMaxInTwoDarray {
	public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        for(int i = col-1; i>=0; i--){
            if(array[0][i] == target){
                return true;
            }
            if(array[0][i] > target){
                continue;
            }
            if(array[0][i] < target){
                for(int j =0 ;j<row; j++){
                    if(array[j][i] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
