package project.leetcode.code;

public class LeetcodeBank {
	public static void main(String[] args) {
		int n =20;
		int finalResult = 1;
		int count = 1;
		for (int i = 1; i < n; i++) {
			if (i % 7 == 0) {
				count = (i / 7)+1;
				finalResult += count;
			}else {
			count = count + 1;
			finalResult += count;
			}
		}
		System.out.println(finalResult);
	}
}
