package project.leetcode.code;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int i = 0;
		int j = height.length - 1;

		int maxWater = Integer.MIN_VALUE;
//		while (i < j) {
//
//			int startingVal = height[i];
//			int endingVal = height[j];
//
//			int smallest = Math.min(startingVal, endingVal);
//
//			int possibleWaterValueBetween2Points = smallest * (j - i);
//
//			maxWater = Math.max(possibleWaterValueBetween2Points, maxWater);
//
//			if (height[i] < height[j]) {
//				i++;
//			} else {
//				j--;
//			}
//		}

//		System.out.println(maxWater);
		System.out.println(maxWater(height, i, j, maxWater));

	}

	public static int maxWater(int[] height, int left, int right, int maxWater) {

		if (left >= right) {
			return maxWater;
		}

		int startingVal = height[left];
		int endingVal = height[right];

		int smallest = Math.min(height[left], height[right]);

		int possibleWaterValueBetween2Points = smallest * (right - left);

		maxWater = Math.max(possibleWaterValueBetween2Points, maxWater);

		if (height[left] < height[right]) {
			left++;
		} else {
			right--;
		}

		return maxWater(height, left, right, maxWater);
	}

}
