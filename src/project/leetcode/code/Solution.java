package project.leetcode.code;

class Solution {
	public static void main(String[] args) {
		int count = Solution.countVowelSubstrings("aeiouu");
		System.out.println(count);
	}

	public static int countVowelSubstrings(String word) {
		char[] arr = word.toCharArray();
		int[] count = new int[26];

		int j = 0; // start index for the sliding window
		int ans = 0;
		int end = 0; // no need to recompute end every time so we declare it here
		for (int i = 0; i < arr.length; i++) {
			if (!isVowel(arr[i])) {
				count = new int[26];
				j = i + 1;
				continue;

			} // reset count arr if cur char isn't a vowel, and set our start index to i + 1

			count[arr[i] - 'a']++;
			if (i >= end)
				end = i + 1; // only update end when necessary
			while (j < arr.length && found(count)) {
				while (end < arr.length && isVowel(arr[end]))
					end++; // update end position if needed
				
				ans += end - i; // this is the valid range
				count[arr[j++] - 'a']--;
			}
		}

		return ans;
	}

	private static boolean found(int[] count) {
		return count['a' - 'a'] > 0 && count['e' - 'a'] > 0 && count['i' - 'a'] > 0 && count['o' - 'a'] > 0
				&& count['u' - 'a'] > 0;
	}

	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}