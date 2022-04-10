package project.leetcode.code;

import java.util.HashMap;

public class MultiplyFound {

	public static void main(String[] args) {
		
	
		
//		int[] nums = { 5, 3, 6, 1, 12 };
//		int original = 3;
//
////		for (int i = 0; i < nums.length; i++) {
////
////			if (nums[i] == original) {
////				original = original * 2;
////			}
////		}
//		
//		Arrays.sort(nums);
//		original = getMultiply( nums, original, 0);
//		
//		System.out.println(original);
	}

	private static int getMultiply(int nums[], int original, int i) {
		
		if(i>=nums.length) 
			return original;
		
		if(nums[i]==original) {
			original=original*2;
			
		}
		
		return getMultiply(nums, original, i+1);
	}

}
