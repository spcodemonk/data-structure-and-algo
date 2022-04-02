package project.leetcode.code;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = new int[] { 4,1,2,3 };

		int n = nums.length;
		System.out.println(n);
		
////		nums= getsortedData(nums,  n, 0);
//		nums = getsortedData(nums,  n, 1);
		for (int i = 0; i < nums.length; i += 2) {

			for (int j = 0; j < n - i - 2; j += 2) {

				if (nums[j] > nums[j + 2]) {

					int temp = nums[j];
					nums[j] = nums[j + 2];
					nums[j + 2] = temp;
				}
			}
		}
		
		for (int i = 1; i < nums.length; i += 2) {

			for (int j = 1; j < n - i - 1; j += 2) {

				if (nums[j] < nums[j + 2]) {

					int temp = nums[j];
					nums[j] = nums[j + 2];
					nums[j + 2] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(nums));
	}

	public static int[] getsortedData(int[] nums, int n,int index) {
		for (int i = index; i < nums.length; i += 2) {

			for (int j = index; j < n - i - 2; j += 2) {

				if (nums[j] > nums[j + 2]) {

					int temp = nums[j];
					nums[j] = nums[j + 2];
					nums[j + 2] = temp;
				}
			}
		}
		return nums;
	}
}
