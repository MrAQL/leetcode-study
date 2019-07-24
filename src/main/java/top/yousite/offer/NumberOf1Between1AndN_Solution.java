package top.yousite.offer;

public class NumberOf1Between1AndN_Solution {
    //整数中1出现的次数（从1到n整数中1出现的次数）
    //暴力，有待完善
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <=n; i++) {
            int temp = i;
            while (temp!=0){
                if (temp%10 == 1){
                    count++;
                }
                temp/=10;
            }
        }
        return count;
    }
}
