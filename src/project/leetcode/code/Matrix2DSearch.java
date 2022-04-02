package project.leetcode.code;

import java.util.Arrays;

public class Matrix2DSearch {

	public static void main(String[] args) {
//		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		
		int[][] matrix = { { 1 }};

		int target = 1;

		for (int i = 0; i < matrix.length; i++) {

			int n1 = matrix[i][0];
			int n2 = matrix[i][matrix[i].length - 1];

			if (target >= n1 && target <= n2) {
				System.out.println(i);
				int[] arr = matrix[i];

				int start = 0;
				int end = arr.length - 1;
				int mid = -1;
				while (start <= end) {
					mid = (start + end) / 2;

					if (arr[mid] == target) {
						System.out.println("Boom");
						break;
					}

					if (arr[mid] > target) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}

				System.out.println("Done");
			}

		}

	}
}
