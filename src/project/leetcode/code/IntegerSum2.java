package project.leetcode.code;

public class IntegerSum2 {

	public static void main(String[] args) {
		
		int a= -2;
		int b=5;
		if(a<0 || b<0) {
			a=0-a*1;
			b=0-b*1;
		}
		for (int i = 1; i <= b; i++) 

		{
			a++;
		}
		System.out.println(a);

	}

}
