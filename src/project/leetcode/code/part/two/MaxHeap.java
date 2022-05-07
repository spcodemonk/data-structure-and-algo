package project.leetcode.code.part.two;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MaxHeap {

	public static void main(String[] args) {
		String arr[] = new String[] { "apple", "orange", "apple", "orange", "apple", "kiwi", "kiwi", "grapes","banana" };
		
		Map<String,Long> mapData = Arrays.stream(arr).collect(Collectors.groupingBy(str ->str, Collectors.counting()));
	
		System.out.println(mapData);
//		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(mapData.get(o2) - mapData.get(o1) ==0) {
					return   o1.compareToIgnoreCase(o2);
				}else {
					return (int) (mapData.get(o2) - mapData.get(o1));
				}
			}
			
		};
		
		PriorityQueue<String> heap = new PriorityQueue<>(comparator);
	
		for(int i=0;i<arr.length;i++) {
			
			heap.add(arr[i]);
			
		}
		System.out.println(heap);
	}

}
