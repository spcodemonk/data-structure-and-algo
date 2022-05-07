package project.leetcode.code.part.two;

import java.util.Arrays;

public class FinalPriceWithDiscount {

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < prices.length; i++) {

			for (int j = i + 1; j < prices.length; j++) {

				if (prices[j] <= prices[i]) {
					prices[i] = prices[i] - prices[j];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(prices));
	}

}
