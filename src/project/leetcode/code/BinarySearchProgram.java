package project.leetcode.code;

import java.util.Arrays;

public class BinarySearchProgram {

	public static void main(String[] args) {
		int[] nums = new int[] { 5,7,7,8,8,10 };
		int target = 8;
		
		int res[]=new int[2];
		
		res[0] = findStartingIndex(nums,target);
		res[1] = findEndingIndex(nums,target);
	
		System.out.println(Arrays.toString(res));
	}
	
	public static int  findEndingIndex(int []nums,int target) {
		int index =-1;
		int start=0;
		int end=nums.length-1;
		int mid = -1;
		
		
		while(start<=end) {
			
			mid = (start+end)/2;
			
//			if(nums[mid]==target) {
//					System.out.println("found element at index "+mid);
//					break;
//			}
//			
			if(target >= nums[mid]) {
				start=mid+1;
				
			}else {
				end = mid-1;
			}
			
			if(nums[mid]==target) {
				index =mid;
			}
			
		}
		
		return index;
	}

	public static int  findStartingIndex(int []nums,int target) {
		int index =-1;
		int start=0;
		int end=nums.length-1;
		int mid = -1;
		
		
		while(start<=end) {
			
			mid = (start+end)/2;
			

			if(target <= nums[mid]) {
				end = mid-1;
				
				
			}else {
				start=mid+1;
			}
			
			if(nums[mid]==target) {
				index =mid;
			}
			
		}
		
		return index;
	}

}
