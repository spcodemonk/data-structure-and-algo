package project.leetcode.code;

import java.util.Arrays;

public class FindPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 6, 7, 8, 9 };
		int target = 4;

			int position = Arrays.binarySearch(nums, 3);
			
//			if(position>=0)return position;
//			System.out.println(-1 * position);
			
			position= -1 * position;
			
				position=position-1;	
			
			
			System.out.println(position);

	}

}
