package top.yousite.leetcode.array.middle;

import java.util.*;

/**
 * 380. 常数时间插入、删除和获取随机元素
 */
class RandomizedSet {
    HashMap<Integer,Integer> map;
    List<Integer> list;
    int size;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap();
        list = new ArrayList<>();
        size = 0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }else{
            list.add(size,val);
            map.put(val,size);
            size++;
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)){
            return false;
        }else if(size == 0){
            map.remove(val);
        }else{
            Integer removeIndex = map.get(val);
            Integer lastVal = list.get(size-1);

            list.set(removeIndex,lastVal);
            map.put(lastVal,removeIndex);
            map.remove(val);    //先put在remove（有可能val就是最后一个）
            size--;
        }

        return true;
    }


    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(new Random().nextInt(size));
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
