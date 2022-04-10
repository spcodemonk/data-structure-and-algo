package project.leetcode.code;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 2, 3,3,3,3 };
		int k = 2;
		Map<Integer, Integer> count = new HashMap();
		for (int n : nums) {
			count.put(n, count.getOrDefault(n, 0) + 1);
		}

		// init heap 'the less frequent element first'
		Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));

		// 2. keep k top frequent elements in the heap
		// O(N log k) < O(N log N) time
		for (int n : count.keySet()) {
			heap.add(n);
			if (heap.size() > k)
				heap.poll();
		}

		// 3. build an output array
		// O(k log k) time
		int[] top = new int[k];
		for (int i = k - 1; i >= 0; --i) {
			top[i] = heap.poll();
		}

	}

}
