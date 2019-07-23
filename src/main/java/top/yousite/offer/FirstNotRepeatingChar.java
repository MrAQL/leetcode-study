package top.yousite.offer;

public class FirstNotRepeatingChar {
    //第一个只出现一次的字符
    //桶排序（怎么存进来，就怎么取出去）
    public int FirstNotRepeatingChar(String str) {
        int[] temp = new int[58];
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            temp[t-'A']++;
        }

        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if(temp[t-'A'] == 1){
                return i;
            }
        }
        return -1;
    }
}
