package project.leetcode.code;

import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.stream().mapToInt(Integer::intValue).sum();
	}

}
