package java.top.yousite.leetcode.greedy;

public class LemonadeChange {
    /**
     * 860. 柠檬水找零
     */
    /**
     * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
     *
     * 注意，一开始你手头没有任何零钱。
     *
     * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
     *
     */
    public boolean lemonadeChange(int[] bills) {
        int curf = 0;   //目前5元张数
        int curt = 0;   //目前10元张数
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5){
                curf++;
            }
            else if (bills[i] == 10){
                if (curf==0){
                    return false;
                }else {
                    curt++;
                    curf--;
                }
            //优先把10元的先用掉
            }else{
                if (curf>=1 &&curt>=1){
                    curf--;
                    curt--;
                }else if(curf>=3){
                    curf-=3;}
                else{
                    return false;}
            }
        }
        return true;
    }
}
