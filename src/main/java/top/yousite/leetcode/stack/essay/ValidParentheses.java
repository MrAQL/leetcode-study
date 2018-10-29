package java.top.yousite.leetcode.stack.essay;

import java.util.Stack;

public class ValidParentheses {
    /**
     * 20. 有效的括号
     */
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        char[]chs = s.toCharArray();
        for (char ch :chs){
            if (ch == '(' || ch == '[' ||ch == '{'){
                stack.push(ch);
            }else {
                if (stack.empty()) return false;
                if (ch == ')' && stack.peek() !='('){
                    return false;
                }
                if (ch == '}' && stack.peek() !='{'){
                    return false;
                }
                if (ch == ']' && stack.peek() !='['){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}
