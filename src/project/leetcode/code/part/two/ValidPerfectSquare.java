package project.leetcode.code.part.two;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		int num = 16;

		if (num == 1) {
			System.out.println(false);
		}
		int start = 1;
		int end = num;
		while (start <= end) {
			long mid = (start + (end - start) / 2);
			if (mid * mid == num) {
				System.out.println(true);
			} else if (mid * mid < num) {
				start = (int) mid + 1;
			} else {
				end = (int) mid - 1;
			}
		}
		System.out.println(false);
	}

}
