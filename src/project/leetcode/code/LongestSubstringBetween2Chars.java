package project.leetcode.code;

public class LongestSubstringBetween2Chars {

	public static void main(String[] args) {
		String s = "aa";
		int biggestLength = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = s.length() - 1; j >= i; j--) {

				if (s.charAt(i) == s.charAt(j)) {

					while (i != j) {
						count++;
						j--;
					}
					break;
				}
			}
			biggestLength = Math.max(count, biggestLength);
		}
		System.out.println(biggestLength - 1);
	}
}
