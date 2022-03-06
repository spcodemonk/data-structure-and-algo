package project.leetcode.code;

import java.util.Arrays;

public class PlusAdd {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		
		int k=11;
		int carry=0;
		
		
		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] != 9) {

				digits[i]++;
				break;
			} else {
				digits[i] = 0;
			}
		}

		if (digits[0] == 0) {
			
			int res[]=new int[digits.length+1];
			res[0]=1;
		}
		
		System.out.println(Arrays.toString(digits));

	}
	

	}


