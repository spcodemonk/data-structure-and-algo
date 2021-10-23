package project.leetcode.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingExampkle {

	public static void main(String[] args) {

		int nums[] = { 4, 1, -1, 2, -1, 2, 3 };
		
		int k=2;
		int count=0;
		
		int arr[]=new int[k];

		Map<Integer,Long> data = IntStream.of(nums).boxed().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
		
		
		
	    List<Map.Entry<Integer,Long> > list =
	               new LinkedList<Map.Entry<Integer,Long> >(data.entrySet());
	 
	        // Sort the list
	        Collections.sort(list, new Comparator<Map.Entry<Integer,Long> >() {
	            public int compare(Map.Entry<Integer,Long> o1,
	                               Map.Entry<Integer,Long> o2)
	            {
	                return (o2.getValue()).compareTo(o1.getValue());
	            }
	        });
	         
	        // put data from sorted list to hashmap
	        HashMap<Integer,Long> temp = new LinkedHashMap<Integer,Long>();
	        for (Map.Entry<Integer,Long> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        
	        
	        for (Map.Entry<Integer,Long> en : temp.entrySet()) {
	        	
	        	arr[count]=en.getKey();
	            System.out.println("Key = " + en.getKey() +
	                          ", Value = " + en.getValue());
	            count++;
	            if(count==k) {
	            break;	
	            }
	        }
	        
	        System.out.println(Arrays.toString(arr));
		
	}

}
