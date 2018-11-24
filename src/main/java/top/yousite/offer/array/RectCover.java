package java.top.yousite.offer.array;

public class RectCover {
    /**
     * 矩形覆盖
     */
    public int RectCover(int target) {
        //f(n)=f(n-1)+f(n-2)
        //递归
        /*if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        return RectCover(target-1)+RectCover(target-2);*/

        //非递归
        if(target ==0)return 0;
        if(target ==1)return 1;
        if(target ==2)return 2;
        int p1= 1;
        int p2=2;
        int res =0;
        for(int i =2;i<target;i++){
            res=p1+p2;
            p1=p2;
            p2=res;
        }
        return res;
    }
}
