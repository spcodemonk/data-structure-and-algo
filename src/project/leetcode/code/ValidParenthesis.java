package project.leetcode.code;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String s = "()[]{}";
		
		Stack<Character> data = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			
			
			if(ch==')' && data.peek()=='(') {
				data.pop();
				continue;
			}else if(ch==']' && data.peek()=='[') {
				data.pop();
				continue;
			} if(ch=='}' && data.peek()=='{') {
				data.pop();
				continue;
			}else {
				data.add(ch);
			}
			
		}
		
		

		System.out.println(data.isEmpty());
	}

}
