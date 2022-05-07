package project.leetcode.code.part.two;

import java.util.Arrays;

public class BuildArrayfromPermutation {

	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		
		int result []=new int [nums.length]; 
		
		for(int i=0;i<nums.length;i++) {
			
			result[i]=nums[nums[i]];
		}
		System.out.println(Arrays.toString(result));
	}
	
	
	

}
