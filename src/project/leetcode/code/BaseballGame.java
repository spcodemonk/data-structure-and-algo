package project.leetcode.code;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {

		String[] ops = { "5","-2","4","C","D","9","+","+"};
		
		Stack<Integer> stack = new Stack<>();
		

		for(int i=0;i<ops.length;i++) {
			
			if(ops[i].equals("C")) {
				stack.pop();
			}else if(ops[i].equals("D")) {
				
				stack.add(stack.peek()*2);
			}else if(ops[i].equals("+")) {
				

				stack.add(stack.get(stack.size()-1) + stack.get(stack.size()-2));
				
				
			
			}else {
				stack.add(Integer.parseInt(ops[i]));
			}
			
		}
		
		System.out.println(stack.stream().reduce(0,(a,b)->a+b));
		
		System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
		
	}

}
