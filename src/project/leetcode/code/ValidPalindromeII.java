package project.leetcode.code;

public class ValidPalindromeII {

	public static void main(String[] args) {
		
		String s = "abca";
		
		int i=0;
		int j=s.length()-1;
		int count=1;
		while(i<=j) {
			
			if(count>1) {
				
			}
			if(s.charAt(i) !=s.charAt(j)) {
				count++;
			}
			
			i++;
			j--;
		} 

	}

}
