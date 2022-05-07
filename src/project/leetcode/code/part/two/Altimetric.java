package project.leetcode.code.part.two;

import java.util.Arrays;

public class Altimetric {

	public static void main(String[] args) {

		String str = "find the duplicate word in the sentence using core concept? Java is a programing language and spring is a framework and Hibernate is an orm tool";
		
		
		String arr[] =str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			String str1= arr[i];	
			for(int j=i+1;j<arr.length;j++) {
				
				if(str1.equals(arr[j])) {
					System.out.println(str1);
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		////		Sort the array using java logic and print the sum of array
//		int[] array = {1, 2, 3, -1, -2, 4};
//		
//		int sum=0;
//		for(int i=0;i<array.length;i++) {
//			
//			
//			for(int j=i+1;j<array.length;j++) {
//				
//				if(array[j]<array[i]) {
//					int temp = array[i];
//					array[i]= array[j];
//					array[j]=temp;
//				}	
//			}
//		}
//		System.out.println(Arrays.toString(array));
//		
//		
//		for(int i=0;i<array.length;i++) {
//			sum+=array[i];
//		}
//		System.out.println(sum);
	}

}
