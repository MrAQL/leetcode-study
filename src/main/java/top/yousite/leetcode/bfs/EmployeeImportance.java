package java.top.yousite.leetcode.bfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class EmployeeImportance {
    /**
     * 690. 员工的重要性
     */
    /**
     * 输入: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
     * 输出: 11
     * 解释:
     * 员工1自身的重要度是5，他有两个直系下属2和3，而且2和3的重要度均为3。
     * 因此员工1的总重要度是 5 + 3 + 3 = 11。
     *
     */
    /*class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };*/

    //bfs(与二叉树层次遍历类似)
    public int getImportance(List<Employee> employees, int id) {
        if(employees.size()==0|| employees== null) return 0;
        int sum = 0;
        Queue<Employee> queue = new LinkedList<Employee>();
        Map<Integer,Employee> map = new HashMap<Integer, Employee>();
        for(Employee e: employees){
            map.put(e.id,e);
        }
        queue.offer(map.get(id));
        while (!queue.isEmpty()){
            Employee temp = queue.poll();
            if (temp.subordinates!=null){
                for (Integer i :temp.subordinates){
                    queue.offer(map.get(i));
                }
            }
            sum+=temp.importance;
        }
        return sum;
    }
}
