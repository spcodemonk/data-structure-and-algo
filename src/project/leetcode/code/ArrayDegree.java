package project.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDegree {

	public static void main(String[] args) {
		int []nums = {1,2,5,2,3};
		int target = 5;
		

			Arrays.sort(nums);
			
			ArrayList<Integer> data = new ArrayList<>();
			for(int i=0;i<nums.length;i++) {
				
				int j=i;
				if(nums[j]==target) {
					while(j<nums.length && nums[j]==target) {
						data.add(j);
						j++;
					}
					break;
				}
			}
			
			Collections.sort(data);
			System.out.println(data);
		
		
	}

}
