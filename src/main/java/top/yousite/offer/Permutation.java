package top.yousite.offer;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    //全排列
    //回溯
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        help(str.toCharArray(),res,0,str.length()-1);
        Collections.sort(res);
        return res;
    }

    private void help(char[] str,ArrayList<String> res,int p,int q){
        if (p==q){
            if(!res.contains(String.valueOf(str))){
                res.add(String.valueOf(str)); }}
        for (int i = p; i <= q; i++) {
            swap(str,p,i);
            help(str,res,p+1,q);
            swap(str,p,i);
        }

    }

    private void swap(char[] chars,int p,int q){
        char temp = chars[p];
        chars[p] = chars[q];
        chars[q] = temp;
    }
}
