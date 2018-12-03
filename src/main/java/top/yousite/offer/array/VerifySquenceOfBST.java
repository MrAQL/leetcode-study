package java.top.yousite.offer.array;

public class VerifySquenceOfBST {
    /**
     * 二叉搜索数的后序遍历序列
     */
    /**
     * 思路:
     *              7
     *            /  \
     *           5    9
     *         /  \  / \
     *         4  6 8  10
     *
     *
     * 后序为：(4,6,5)(8,10,9)7
     *                          (左子树都小于根，右子树都大于根)
     * 1.获取根节点
     * 2.循环 找到 左子树 的最后一个（index）
     * 3.从index开始，判断右子书是否全都大于根
     * 4.递归左子树
     * 5.递归右子树
     */

    //与leetcode---(654. 最大二叉树) 类似
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null ||sequence.length ==0){
            return false;
        }
        return bfs(sequence,sequence.length);
    }

    private boolean bfs(int [] sequence,int length ){
        int root = sequence[length-1];
        //找出左字树的最后一个
        int index=0;
        for(int i =0;i<length-1;i++){
            if(sequence[i]<root){
                index++;
            }else{
                break;
            }
        }

        //右子树
        int j =index;
        for(;j<length-1;j++){
            if(sequence[j]<root){
                return false;
            }
        }

        //判断左子树
        boolean leftRes = true;
        if(index>0){
            leftRes = bfs(sequence,index);
        }

        //判断右子树
        boolean rightRes = true;
        if(index<length-1){
            rightRes= bfs(sequence,length - 1-index);
        }
        return leftRes && rightRes;

    }
}
