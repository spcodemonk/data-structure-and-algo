package project.leetcode.code;

public class AddDigits {

	public static void main(String[] args) {
		
		int num = 38;
		
		while(num>9) {
			
			int sum=0;
			while(num>0) {
				sum+=num%10;
				num=num/10;
				
			}
			num=sum;
		}
		System.out.println(num);

	}

}
