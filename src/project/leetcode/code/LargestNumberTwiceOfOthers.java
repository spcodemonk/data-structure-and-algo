package project.leetcode.code;

import java.util.Arrays;

public class LargestNumberTwiceOfOthers {

	public static void main(String[] args) {

		int[] nums = {1};
		

		int n = Arrays.stream(nums).max().getAsInt();
		
		
		int index=0;
		int val=-1;
		while(index<nums.length) {
			
			if(nums[index]*2 <= n || n%nums[index]==0) {
				
				if(n==nums[index])
					val=index;
			}else {
				System.out.println("not1");
			}
			index++;
		}
		
		if(index!=nums.length) {
			System.out.println("not2");
		}
		
		System.out.println("Done "+val);
		
	}

}
