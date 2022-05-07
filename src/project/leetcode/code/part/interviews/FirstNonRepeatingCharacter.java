package project.leetcode.code.part.interviews;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "strTess";

		for (int i = 0; i < str.length(); i++) {

			Character ch = str.charAt(i);

			int res = str.indexOf(ch) - str.lastIndexOf(ch.toLowerCase(ch));

			int res1 = str.indexOf(ch) - str.lastIndexOf(ch.toUpperCase(ch));
			if (res == 0 && res1 == 0) {
				System.out.println(ch);
				break;
			}
		}
	}
}
