package project.leetcode.code;

import java.util.ArrayDeque;
import java.util.Deque;

public class BackspaceStringCompare {

	public static void main(String[] args) {

		String s = "abc#", t = "bac#";
		
		
		
		if(buildString(s).equals(buildString(t))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}



	}
	
	public static String buildString(String str) {
		Deque<Character> stack = new ArrayDeque<>();

		for (char ch : str.toCharArray()) {

			if (ch == '#') {
				stack.pollLast();
			} else {
				stack.add(ch);
			}
		}
		
		return String.valueOf(stack);
	}

}
