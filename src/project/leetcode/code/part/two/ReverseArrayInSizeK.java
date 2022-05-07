package project.leetcode.code.part.two;

import java.util.Arrays;

public class ReverseArrayInSizeK {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5,6 };

		int k = 4;

		int start = 0;
		int end = k - 1;
		
		while(arr.length-start>k) {
			
		
		for (int i = start, j = end; i < j; i++, j--) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			

		}
			start = end+1;
			end =end+k;
		}
		System.out.println(Arrays.toString(arr));

	}

}
