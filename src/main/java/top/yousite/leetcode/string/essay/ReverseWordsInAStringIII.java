package main.java.top.yousite.leetcode.string.essay;

public class ReverseWordsInAStringIII {
    /**
     * 557. 反转字符串中的单词 III
     */

    /**
     * 取出每个单词，后进行反转，增加到新的变量中
     *
     */
    public String reverseWords(String s) {
        String[]wordArr =s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordArr){
            char[]wordCh = word.toCharArray();
            for (int begin =0 , end = wordCh.length-1; begin<end;begin++,end--){
                char temp = wordCh[begin];
                wordCh[begin] = wordCh[end];
                wordCh[end] = temp;
            }
            stringBuilder.append(wordCh).append(" ");
        }
        return stringBuilder.toString().trim(); //头尾去空
    }
}
