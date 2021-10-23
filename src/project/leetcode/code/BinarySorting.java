package project.leetcode.code;

public class BinarySorting {

	public static void main(String[] args) {
		
		int []arr = {0,1,2,3,4,5,6,7,8};
		
		for(int i=0;i<arr.length;i++) {
			
			String num1=Integer.toBinaryString(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
					
				String num2=Integer.toBinaryString(arr[j]);
				
				
			
			}
		}
				
				
		System.out.println(Integer.toBinaryString(7));  


	}
	
	public static long countMAtches(String num) {
		return  num.chars().filter(ch -> ch == '1').count();
	}

}
