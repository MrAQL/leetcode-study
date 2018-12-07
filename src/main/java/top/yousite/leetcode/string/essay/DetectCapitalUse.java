package java.top.yousite.leetcode.string.essay;

public class DetectCapitalUse {
    /**
     * 520. 检测大写字母
     */

    /**
     * 我们定义，在以下情况时，单词的大写用法是正确的：
     *
     * 全部字母都是大写，比如"USA"。
     * 单词中所有字母都不是大写，比如"leetcode"。
     * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
     * 否则，我们定义这个单词没有正确使用大写字母。
     *
     */

    /**
     * 示例 1:
     * 输入: "USA"
     * 输出: True
     *
     * 示例 2:
     * 输入: "FlaG"
     * 输出: False
     */

    /*public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) return true;
        char[]chars =word.toCharArray();
        //一位(永远true，无论是'A'或'a'都可以)
        if (chars.length ==1){
            return true;
        }
        //两位
        if (chars.length == 2 ){
            if (chars[0]>'Z'){
                if (chars[1]<'a'){
                    return false;
                }
            }
            return true;
        }



        if(isNotBigCase(chars[0]) == false){
            //Aaa
            if (isNotBigCase(chars[1])){    //判断第二位是否为大写
                for (int i = 2; i < chars.length ; i++) {
                    if (isNotBigCase(chars[i])){}
                    else
                    { return  false;}
                }
                return true;
            }
            //AAA
            else{
                for (char s :chars){
                    if(isNotBigCase(s) == true){
                        return false;
                    };
                }
                return true;

            }
        }
        //全小写
        else if (isNotBigCase(chars[0])){
            for (char s :chars){
                if (isNotBigCase(s)){}
                else {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    //非大写
    private boolean isNotBigCase(char ch){
        if(ch>'Z'){
            return true;
        }
        return false;
    }*/

    //简化版
    public boolean detectCapitalUse(String word) {
        if (word.length() <2) return true;
        //全大写
        if (word.toUpperCase().equals(word)){
            return true;
        }
        if(word.substring(1).toLowerCase().equals(word.substring(1))){
            return true;
        }
        return false;
    }
}
