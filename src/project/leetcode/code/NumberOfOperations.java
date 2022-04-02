package project.leetcode.code;

public class NumberOfOperations {

	public static void main(String[] args) {
		int num1 = 2, num2 = 3;

		int count = 0;
		while (num1 != 0 && num2 != 0) {

			if (num1 >= num2) {
				num1 = num1 - num2;
			} else if (num2 >= num1) {
				num2 = num2 - num1;
			}
			count++;
		}
		
		
		System.out.println(count);
	}

	private static int getCOunt(int num1, int num2) {
		int count = 0;

		if (num1 == 0 || num2 == 0) {
			return 0;
		}

		if (num1 >= num2) {
			num1 = num1 - num2;
		} else if (num2 >= num1) {
			num2 = num2 - num1;
		}

		return getCOunt(num1, num2) + 1;
	}
}
