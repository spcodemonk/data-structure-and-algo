package project.leetcode.code.part.two;

import java.util.Stack;

public class Remove_Adjacent_Duplicate_II {

	public static void main(String[] args) {
		String s = "pbbcggttciiippooaais";

		Stack<Element> stack = new Stack<>();

		int count = 0;
		int k = 2;
		for (char c : s.toCharArray()) {

			if (!stack.isEmpty() && stack.peek().getCh() == c) {
				stack.peek().setCount(stack.peek().getCount() + 1);
				
				if(stack.peek().getCount()==k) {
					stack.pop();
				}
			} else {

				Element e = new Element(c, 1);
				stack.add(e);
			}

		}
		StringBuilder sbd = new StringBuilder();

		while(!stack.isEmpty()) {
			Element el = stack.pop();	
			int count1 = el.getCount();
			char ch = el.getCh();
			for(int i=0;i<count1;i++) {
				sbd.append(ch);
			}
		}
		System.out.println(sbd.reverse());

	}

}

class Element {
	private char ch;
	private int count;

	public Element(char ch, int count) {
		super();
		this.ch = ch;
		this.count = count;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
