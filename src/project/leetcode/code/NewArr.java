package project.leetcode.code;

import java.util.Arrays;

public class NewArr {

	public static void main(String[] args) {
		
		int [] nums = {1,2,1};
		
		int arr[]=new int[nums.length*2];
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=nums[j];
			if(j==nums.length-1) {
				j=0;
			}else {
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
