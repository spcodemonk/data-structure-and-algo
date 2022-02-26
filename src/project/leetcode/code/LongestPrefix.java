package project.leetcode.code;

public class LongestPrefix {

	public static void main(String[] args) {
		String strs[] = { "flower", "flow", "flight" };

		String longest = "";
		if (strs == null || strs.length == 0) {
//			return longest;
		}

		int index = 0;
		for (char c : strs[0].toCharArray()) {

			for (int i = 1; i < strs.length; i++) {

				if (index >= strs[i].length() || strs[i].charAt(index) != c) {
					
				}

			}

			longest += c;
			index++;
		}
		
		System.out.println(longest);
	}
}
