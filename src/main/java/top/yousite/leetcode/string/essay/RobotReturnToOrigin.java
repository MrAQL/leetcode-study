package main.java.top.yousite.leetcode.string.essay;

public class RobotReturnToOrigin {
    /**
     * 657. 机器人能否返回原点
     */
    public boolean judgeCircle(String moves) {
        if(moves ==null ||moves.length() ==0){return true;};
        int x = 0;  //记录左右移动
        int y = 0;  //记录上下移动
        char[]ch = moves.toCharArray();
        for (int i =0 ;i<ch.length;i++){
            if (ch[i] == 'L') x--;
            if (ch[i] == 'R') x++;
            if (ch[i] == 'D') y--;
            if (ch[i] == 'U') y++;
        }
        if (x==0&&y==0){
            return true;
        }
        return false;
    }
}
