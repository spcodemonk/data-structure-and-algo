package project.leetcode.code.part.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		int[] arr = {3,8,-10,23,19,-4,-14,27};

		Arrays.sort(arr);

		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
				
			if(arr[i]-arr[i-1]<min){
				min =arr[i]-arr[i-1]; 
			}
		}

		System.out.println(min);
		List<List<Integer>> data = new ArrayList<>();

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - arr[i - 1] == min) {
				data.add(Arrays.asList(arr[i - 1], arr[i]));
			}
		}

		System.out.println(data);
	}
}
