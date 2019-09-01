package top.yousite.leetcode.math.essay;

import java.util.*;
public class FizzBuzz {
    /**
     * 412. Fizz Buzz
     */
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            String str="";
            if (i % 3 == 0){
                str+="Fizz";
            }else if (i%5 == 0){
                str+="Buzz";
            }else if ("".equals(str)){
                str=String.valueOf(i);
            }
            res.add(str);
        }
        return res;
    }
}
