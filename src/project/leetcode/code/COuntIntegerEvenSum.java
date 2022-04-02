package project.leetcode.code;

public class COuntIntegerEvenSum {

	public static void main(String[] args) {
		
		int num =4;
		
		int count=0;
		for(int i=1;i<=num;i++) {
			
			int temp=i;
			if(i>9) {
			int sum=0;
			
			while(temp>0) {
				sum+= temp%10;
				
				temp = temp/10;
			}
			if(sum%2==0) {
				count++;
			}
				
			}else if(temp%2==0) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
