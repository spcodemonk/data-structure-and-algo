package project.leetcode.code.part.two;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	Map<Integer, Integer> data = new HashMap<>();
	Deque<Integer> queue;

	public LRUCache(int capacity) {
		queue = new ArrayDeque<>(capacity);
	}

	public int get(int key) {
		
		if(data.containsKey(key)) {
			queue.removeLast();
			queue.addFirst(key);
		}
		return data.getOrDefault(data, -1);
	}

	public void put(int key, int value) {

		if (data.containsKey(key)) {
			queue.removeLast();
			queue.addFirst(key);
		} else {
			
			if (queue.size() <= 2) {
				queue.addFirst(key);
				data.put(key, value);
			}else {
				queue.removeLast();
				
				queue.addFirst(key);
				data.put(key, value);
			}
		}
	}

	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		lRUCache.get(1);    // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		lRUCache.get(2);    // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		lRUCache.get(1);    // return -1 (not found)
		lRUCache.get(3);    // return 3
		lRUCache.get(4);    // return 4
	}

}
