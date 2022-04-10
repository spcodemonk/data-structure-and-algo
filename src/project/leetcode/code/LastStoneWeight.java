package project.leetcode.code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {

		int[] stones = {2,7,4,1,8,1 };
		
		
//		List<Integer> data = new ArrayList<>();
//		
//		for(int i=0;i<stones.length;i++) {
//			data.add(-stones[i]);
//		}
//		
//		System.out.println(data);
//		data.sort(Comparator.comparing(Integer::intValue));
//		
//		while(data.size()>1) {
//			
//			int result = data.get(data.size()-1)- data.get(data.size()-2);
//			
//			data.remove(data.size()-1);
//			data.remove(data.size()-1);
//			data.add(result);
//			data.sort(Comparator.comparing(Integer::intValue));
//		}
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
		
		for(int stone : stones) {
			maxHeap.add(-stone);
			
		}
		
		while(maxHeap.size()>1) {
			
			int stoneOne = -maxHeap.remove();
			int stoneTwo = -maxHeap.remove();
			
			if(stoneOne!=stoneTwo) {
					maxHeap.add(stoneOne-stoneTwo);
			}
		}
		

		
		System.out.println(maxHeap.remove());
	}

}
