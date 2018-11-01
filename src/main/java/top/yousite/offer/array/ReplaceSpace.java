package java.top.yousite.offer.array;

/**
 * 替换空格
 */
public class ReplaceSpace {
    //O(n) space and time
    /*public String replaceSpace(StringBuffer str) {
        StringBuffer sbf = new StringBuffer();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                sbf.append("%20");
            }else{
                sbf.append(str.charAt(i));
            }
        }
        return sbf.toString();
    }*/

    //O(n) space and time
    public String replaceSpace(StringBuffer str) {
        int count =0;
        int right =str.length();
        //获取空字符串的个数
        for(int i = 0;i<right;i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }

        // 替换
        int newLength = (right + count*2);
        int newRight = newLength-1 ;
        char [] newChs = new char[newLength];
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                newChs[newRight--]=str.charAt(i);
            }else{
                newChs[newRight--] = '0';  //先赋值后减少
                newChs[newRight--] = '2';
                newChs[newRight--] = '%';
            }
        }
        return new String(newChs);
    }

}


