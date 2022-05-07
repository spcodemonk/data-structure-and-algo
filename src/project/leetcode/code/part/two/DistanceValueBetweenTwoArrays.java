package project.leetcode.code.part.two;

public class DistanceValueBetweenTwoArrays {

	public static void main(String[] args) {

		int arr1 []= {2,1,100,3}, arr2[] = {-5,-2,10,-3,7 }, d = 6;
		
			int count=0;
		for(int i=0;i<arr1.length;i++) {
			
			
			for(int j=0;j<arr2.length;j++) {
				
				
				if(Math.abs(arr1[i] - arr2[j])<=d) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
