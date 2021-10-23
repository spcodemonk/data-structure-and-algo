package project.leetcode.code;

import java.util.Arrays;

public class ArraySortParity {

	public static void main(String[] args) {

		int[] nums = { 3, 1, 2, 4 };

		int[] newArr = new int[nums.length];
		int j = 0;

		newArr = evenOdd(nums, newArr, j, true);
		newArr = evenOdd(nums, newArr, j, false);

		System.out.println(Arrays.toString(newArr));
	}

	private static int[] evenOdd(int[] nums, int[] newArr, int j, boolean flag) {

		if (flag) {
			for (int i = 0; i < nums.length; i++) {

				if (nums[i] % 2 == 0) {
					newArr[j++] = nums[i];
				}
			}
		} else {
			for (int i = 0; i < nums.length; i++) {

				if (nums[i] % 2 != 0) {
					newArr[j++] = nums[i];
				}
			}
		}
		return newArr;
	}

}
