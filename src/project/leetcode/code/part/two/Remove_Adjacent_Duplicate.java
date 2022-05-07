package project.leetcode.code.part.two;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Remove_Adjacent_Duplicate {

	public static void main(String[] args) {
		
		String s = "abbaca";
		
		Deque<Character> stack = new ArrayDeque<>();
		
		for(char c: s.toCharArray()) {
			
			if(!stack.isEmpty() && c==stack.peekLast()) {
				stack.pollLast();
			}else {
				stack.add(c);
			}
		}
		
		StringBuilder sbd = new StringBuilder();
		
		stack.forEach(sbd::append);
	
		System.out.println(sbd);

	}

}
