package main.java.top.yousite.leetcode.stack.essay;

import java.util.Stack;

public class BackspaceStringCompare {

    /**
     * 844. 比较含退格的字符串
     *
     * think:
     *      solve-1.stack
     *      solve-2.point
     *
     */

    /**
     * 1.Stack
     */
    /*public boolean backspaceCompare(String S, String T) {
        Stack s1 =initStack(S);
        Stack s2 =initStack(T);
       return s1.equals(s2) ;

    }

    public Stack initStack(String S){
        char[]c1 = S.toCharArray();
        Stack stack = new Stack();
        for (char ch :c1){
            if (ch !='#') stack.push(ch);
            else {
                if (!stack.empty()){
                    stack.pop();
                }

            }
        }
        return stack;
    }*/

    /**
     * 2.point
     */
    public boolean backspaceCompare(String S, String T) {

        return backspaceCompareResult(S).equals(backspaceCompareResult(T));

    }
    //返回字符串(从尾开始)
    public String backspaceCompareResult(String arg){
        String result= "";
        int count =0 ;  //计算#号个数,小与等于0才可以增加到结果集
        for (int i=arg.length()-1;i>=0;i--){
            char chResult = arg.charAt(i);
            if (chResult =='#'){
                count++;
            }else {
                if (count>0){count--;}
                else {
                    result+=chResult;
                }
            }
        }
        return result;
    }

}
