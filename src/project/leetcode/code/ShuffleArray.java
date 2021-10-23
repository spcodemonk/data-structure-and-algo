package project.leetcode.code;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {

		String word1 = "ab", word2 = "pqrs";

		int length = word1.length() > word2.length() ? word2.length() : word1.length();

		StringBuilder sbd= new StringBuilder();
		int i=0;
		for(;i<length;i++) {
			
			sbd.append(word1.charAt(i));
			sbd.append(word2.charAt(i));
		}

		if(word1.length() > word2.length()) {
			addString(word1,i,sbd);
			
		}
		if(word2.length() > word1.length()) {
			addString(word2,i,sbd);
			
		}
		
		System.out.println(sbd.toString());
	}
	public static void addString(String str,int i,StringBuilder sbd) {
		for(;i<str.length();i++) {
			
			sbd.append(str.charAt(i));

		}
	}

}
