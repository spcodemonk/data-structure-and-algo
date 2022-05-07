package project.leetcode.code.part.two;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
		
		int []nums = {2,6,4,8,10,9,15};
		int snums[]=nums.clone();
		
		Arrays.sort(snums);

		int start = nums.length;
		int end = 0;
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]!=snums[i]) {
				
				start = Math.min(start, i);
				end = Math.max(end, i);
				
			}
		}
		
		System.out.println((end-start)+1);
	}

}
