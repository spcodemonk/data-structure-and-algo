package project.leetcode.code;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
//
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(nums));
		int k = 3;
		
		 k = k%nums.length;
	        rotate(nums, 0, nums.length-1);
	        rotate(nums, 0, k-1);
	        rotate(nums, k, nums.length-1);
	        
//		int prev = nums[0];
//
//		int i = 1;
//
//		int count = 1;
//		while (count <= k) {
//
//			int temp = nums[i];
//			
//
//			nums[i]= prev;
//			
//			
//			if(i == nums.length-1) {
//				nums[0]=temp;
//				i=1;
//				prev=nums[0];
//				count++;
//			}else {
//				i=i+1;
//				prev=temp;
//			}
//
//		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	 private static  void rotate(int[] nums, int i, int j) {
	        while (i <= j) {
	            int temp = nums[i];
	            nums[i] = nums[j];
	            nums[j] = temp;
	            i++;
	            j--;
	        }
	    }

}
