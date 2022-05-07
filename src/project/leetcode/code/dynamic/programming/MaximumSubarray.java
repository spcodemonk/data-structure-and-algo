package project.leetcode.code.dynamic.programming;

public class MaximumSubarray {

	public static void main(String[] args) {
		int nums[] = {-2,-1};

		int arr[] = new int[nums.length];
		arr[0] = nums[0];

		int maxSum = Math.max(Integer.MIN_VALUE, arr[0]);
		for (int i = 1; i < nums.length; i++) {

			if (arr[i - 1] >= 0) {
				arr[i] = arr[i - 1] + nums[i];
			} else {
				arr[i] = nums[i];
			}

			maxSum = Math.max(maxSum, arr[i]);
		}

		System.out.println(maxSum);

	}

}
