package project.leetcode.code;

public class BuySellStock {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		
		int profit=0;
		
		for(int i=0;i<prices.length;i++) {
			
			int tempProfit=0;
			for(int j=i+1;j<prices.length;j++) {
				
				int sum = prices[j] - prices[i];
				if(sum>tempProfit) {
					tempProfit=sum;
				}
			}
			
			if(tempProfit>profit) {
				profit=tempProfit;
			}
		}
		
		System.out.println(profit);
	}

}
