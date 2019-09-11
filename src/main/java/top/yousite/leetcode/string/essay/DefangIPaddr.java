package top.yousite.leetcode.string.essay;

public class DefangIPaddr {
    /**
     * 1108. IP 地址无效化
     */
    public String defangIPaddr(String address) {
        if (address == null ||address.length() ==0){
            return "";
        }
        int count = 0;
        for(char ch:address.toCharArray()){
            if (ch == '.'){
                count++;
            }
        }
        int length = count*2+address.length();
        char[] res = new char[length];

        char[] chars = address.toCharArray();

        for (int i = chars.length-1,j=length-1; i >=0 ; ) {
            if (chars[i]!='.'){
                res[j--]= chars[i--];
            }else{
                res[j--]=']';
                res[j--]='.';
                res[j--]='[';
                i--;
            }
        }
        return String.valueOf(res);
    }
}
