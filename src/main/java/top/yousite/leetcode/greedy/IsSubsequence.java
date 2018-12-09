package java.top.yousite.leetcode.greedy;

public class IsSubsequence {
    /**
     * 392. 判断子序列
     */
    public boolean isSubsequence(String s, String t) {
        //双指针
        //s短，t长
        if(s.length()==0)return true;   //s=""
        char[]sch = s.toCharArray();
        char[]tch = t.toCharArray();
        int index=0;
        for (int i = 0; i < tch.length; i++) {
            if (tch[i] == sch[index]){
                index++;
            }
            if (index == sch.length){   //注意:s.length() == t.length()
                return true;
            }
        }
        return false;
    }
}
