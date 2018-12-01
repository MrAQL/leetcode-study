package java.top.yousite.offer.array;

public class MinStack {
    /**
     * 最小栈
     */
    public class Solution {
        //2个栈实现最小栈
        Stack<Integer> ds= new Stack<>();
        Stack<Integer> ms= new Stack<>();
        public void push(int node) {
            if(ms.isEmpty()){
                ms.push(node);
            }else{
                if(ms.peek()>=node){
                    ms.push(node);
                }
            }
            ds.push(node);

        }

        public void pop() {
            if((ds.peek()).equals(ms.peek())){
                ms.pop();
            }
            ds.pop();
        }

        public int top() {
            return ds.peek();
        }

        public int min() {
            return ms.peek();
        }
    }
}
