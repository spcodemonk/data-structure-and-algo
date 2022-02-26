package project.leetcode.code;

import java.util.ArrayList;

public class StockSum {

	public static void main(String[] args) {
		
		int saving =250;
		
		int []currentValue = {175,133,109,210,97};
		
		int []futureValue= {200,125,128,228,133};
		
		
		ArrayList<Integer> data= new ArrayList<>();
		
		int profit=0;
		int invested=0;
		
		
		for(int i=0;i<currentValue.length;i++) {
			
			
			for(int j=i+1;j<currentValue.length;j++) {
				
				if(invested>=saving) {
					data.add(profit);
					profit=0;
					invested=0;
					
					break;
				}
					
				int sum = futureValue[i]-currentValue[i];
				System.out.println(sum);
				if(sum > 0) {
					profit+=sum;
					invested+=currentValue[i];
				}
				
				
			}
		}
		
//		while(i<currentValue.length) {
//			if(invested>=saving) {
//				data.add(profit);
//				profit=0;
//				invested=0;
//				
//				i=i-1;
//				continue;
//			}
//			int sum = futureValue[i]-currentValue[i];
//			System.out.println(sum);
//			if(sum > 0) {
//				profit+=sum;
//				invested+=currentValue[i];
//			}
//			i++;
//		}
		System.out.println(data);
	}
	
 
}
