package project.leetcode.code;

import java.util.Stack;

public class ScoreofParentheses {

	public static void main(String[] args) {
		String s = "(())";
		int score = 0;
		Stack<Integer> data = new Stack();
		for (char ch : s.toCharArray()) {

			if (ch == '(') {

				data.add(score);
				score = 0;
			} else {

				score = data.pop() + Math.max(score * 2, 1);
			}

		}

		System.out.println(score);

	}

}
