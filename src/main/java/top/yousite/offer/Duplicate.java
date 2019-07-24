package top.yousite.offer;

public class Duplicate {
    //数组中重复的数字
    //法1：(桶排序)
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int[] bucket = new int[10];
        int index = -1;
        for (int i = 0; i < length; i++) {
            bucket[numbers[i]]++;
            if (bucket[numbers[i]]>1){
                index=i;
                break;
            }
        }
        if (index !=-1){
            duplication[0] = numbers[index];
            return true;
        }
        return false;
    }

    //法2：节点index与数组内容对应（空间为1）

}
