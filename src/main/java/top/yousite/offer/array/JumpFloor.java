package java.top.yousite.offer.array;

public class JumpFloor {
    /**
     * 跳台阶
     */
    public int JumpFloor(int target) {
        //非递归（斐波那契数列）
        if(target == 1) return 1;
        if(target == 2) return 2;
        int p1 = 1;
        int p2 = 2;
        int res = 0;
        for(int i=2;i<target;i++){
            res= p1+p2;
            p1=p2;
            p2 = res;
        }
        return res;
    }
}
