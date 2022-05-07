package project.leetcode.code.part.two;

import java.util.Arrays;

public class ArrayTwoPointer {

	public static void main(String[] args) {
		int arr[] = new int [] {1,0,1,0,1,0,1,1};
		
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			
			int valueI=arr[i];
			int valueJ=arr[j];
			
			if(valueI ==1 && valueJ==0) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				
				i++;
				j--;
			}else if(valueI==0) {
				i++;
			}else if(valueJ==1) {
				j--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
