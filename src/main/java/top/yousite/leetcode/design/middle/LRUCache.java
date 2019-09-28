package top.yousite.leetcode.design.middle;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU缓存机制
 */
//法1:使用LinkedHashMap，重写removeEldestEntry方法。
//todo 法2:使用hashmap+doubleLinkedList
class LRUCache extends LinkedHashMap<Integer,Integer>{
    private Integer capacity;

    public LRUCache(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size()>capacity;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */