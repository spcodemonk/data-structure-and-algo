package project.leetcode.code.part.two;

import java.util.Arrays;

public class Snippet {

	public static void main(String args[]) {
		int nums[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

		for (int i = 0; i < nums.length; i++) {
			nums[nums[i] % nums.length] = nums[nums[i] % nums.length] + nums.length;
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= nums.length * 2) {
				System.out.println(i + " ");
			}
		}
	}
}
