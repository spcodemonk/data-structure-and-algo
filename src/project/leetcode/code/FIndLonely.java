package project.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndLonely {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 3 };

		Arrays.sort(nums); // 1, 3, 3, 5
		List<Integer> data = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			if (i - 1 >= 0) {

				if (nums[i] - 1 == nums[i - 1] || nums[i] == nums[i - 1]) {
					continue;
				}
			}

			if (i + 1 < nums.length) {
				if (nums[i] + 1 == nums[i + 1] || nums[i] == nums[i + 1]) {
					continue;
				}
			}

			data.add(nums[i]);

		}
		System.out.println(data);
	}

}
