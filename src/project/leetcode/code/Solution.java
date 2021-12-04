package project.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
		
        
    	int nums []= {4,3,2,7,8,2,3,1};
    	
    	
    	
        ArrayList<Integer> result = new ArrayList<>();
        


        	
        Map<Integer, Long> map1 = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(num->num, Collectors.counting()));
        
      
        for(int i=0;i<nums.length;i++) {
        	
        	if(!map1.containsKey(i+1)) {
        		result.add(i+1);
        	}
        }
        
	
        System.out.println(result);
//        return result;
    }
}