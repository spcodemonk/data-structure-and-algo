package project.leetcode.code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VovelsSubstr {
	public static void main(String[] args) {
		
//		System.out.println(countVowelSubstrings("cuaieuouac"));
		System.out.println(countVowelSubstrings("cuaieuouac"));
	}

	public static int countVowelSubstrings(String word) {
		
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		if (word == null || word.length() < vowels.size()) {
			return 0;
		}

		Map<Character, Integer> countsMap = new HashMap<>();
		int start = -1;
		int count = 0;
		for (int end = 0; end < word.length(); end++) {
			if (vowels.contains(word.charAt(end))) {
				// set the start with first occurrence of vowel character
				if(start==-1) {
					start = end;
				}
				countsMap.put(word.charAt(end), countsMap.getOrDefault(word.charAt(end), 0) + 1);
				// found substring containing vowels only.
				if (countsMap.size() == vowels.size()) {
					count++;
					// keep shrinking the window as long as substring contains all 5 vowels
					int temp = start;
					Map<Character, Integer> tempCountMap = new HashMap<>();  
					tempCountMap.putAll(countsMap);
					while (temp < end && tempCountMap.getOrDefault(word.charAt(temp), 0) > 1) {
						count++;
						tempCountMap.put(word.charAt(temp), tempCountMap.get(word.charAt(temp)) - 1);
						temp++;
					}
				}
			} else {
				// if constant is seen reset the vowel substring start index
				countsMap.clear();
				start = -1;
			}

		}

		return count;
	}
}
