package project.leetcode.code;

public class BinarySearch {

	public static void main(String args[]) {

		int nums[] = { 1,1,5,5,3,3,4,4,6};

		for (int i = 1; i < nums.length; i+=2) {

			if(nums[i]!=nums[i-1]) {
			System.out.println(nums[i-1]);
			break;
			}
		}
		System.out.println(nums[nums.length-1]);

	}

}
