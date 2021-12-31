package project.leetcode.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class CoinChange {

	public static void main(String[] args) {
		int []coins = {1,2,5}; 
		int amount = 11;
			
		coins = Arrays.stream(coins)
        .boxed()
        .sorted(Comparator.reverseOrder()) // just use 'sorted()' for ascending order
        .mapToInt(Integer::intValue)
        .toArray();
		
	
		
		int originalAmount=amount; 
		int sum=0;
		
		int count=0;
		for(int i=0;i<coins.length;i++) {
			
			

			
				
				if(sum + (amount/coins[i]*coins[i]) > originalAmount) continue;
				
				count=count+(amount/coins[i]);
				
				
				
				sum=sum+ (amount/coins[i]*coins[i]);
				
				if(sum==originalAmount) {
					System.out.println(count);
					break;
				}
				
				amount=amount%coins[i];
			}
		
		
		System.out.println("1234");

	}

}
