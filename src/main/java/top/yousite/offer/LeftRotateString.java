package top.yousite.offer;

public class LeftRotateString {
    //左旋转字符串
    public  String LeftRotateString(String str,int n) {
        if (n== str.length() || str.length()==0){
            return str;
        }
        if (n>str.length()){
            n=n%str.length();
        }

        char[] chars = str.toCharArray();
        rev(0,n-1,chars);
        rev(n,str.length()-1,chars);
        rev(0,str.length()-1,chars);
        return String.valueOf(chars);



    }

    private void rev(int left,int right,char[] chars){
        while (left<=right){
            char temp = chars[left];
            chars[left]=chars[right];
            chars[right]= temp;
            left++;
            right--;
        }
    }
}
