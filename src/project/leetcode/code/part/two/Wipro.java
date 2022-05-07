package project.leetcode.code.part.two;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Wipro {

	public static void main(String[] args) {
		
		int arr[] = new int[]{3,4,7,3};
		
		System.out.println(IntStream.of(arr).boxed().distinct().collect(Collectors.toList()));

	}

}
