package project.leetcode.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PalindromInArr {

	public static void main(String[] args) {

		
	
		List<String> data = Arrays.asList("abc","sp","tp","abc");	
	
		
		Map<Boolean, List<String>> map= data.stream().collect(Collectors.partitioningBy(obj->obj.equalsIgnoreCase("abc")));
		
		Map<Object, List<String>> sa = data.stream().collect(Collectors.groupingBy(obj->obj,Collectors.toList()));
		
		System.out.println(sa);
		
		int n=4;
		 int count =0;
	        int i=1;
	        while(i<=n){
	            
	            if(n%i==0){
	                count++;
	            }
	            
	            if(count==3) {
	            	System.out.println("found");
	            	break;
	            }
	            
	            i++;
	        }
	        
	        System.out.println("not foud "+count);;
	        
}
}
