package project.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestInMatrixTable {

	public static void main(String[] args) {

		int m = 3;

		int n = 3;

		int k = 5;


		
		int result[]=new int[m*n];
		
		int p=0;
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				
				
				result[p++]=(i + 1) * (j + 1);

			}

		}


		
		Arrays.sort(result);
		
	
		System.out.println(result[k-1]);

	}
}
