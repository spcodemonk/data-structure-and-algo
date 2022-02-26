package project.leetcode.code;

import java.util.Arrays;

public class ArrayShuffle {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;

		int[] newNums = new int[nums.length];
		
		int index=0;
		for (int i = 0,j=nums.length/2; i < nums.length/2; i++,j++) {
			
			newNums[index++]=nums[i];
			newNums[index++]=nums[j];
		}
		
	System.out.println(Arrays.toString(newNums));

	}

}
