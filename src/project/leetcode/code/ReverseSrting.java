package project.leetcode.code;

import java.util.Arrays;

public class ReverseSrting {

	public static void main(String[] args) {
		char [] s = {'h','e','l','l','o'};
		
		s= reverseStringArr(s,  0,  s.length-1);
		System.out.println(Arrays.toString(s));
		
		
	}

	public static char[] reverseStringArr(char []s, int i, int j) {
		
		
		if(i<j) {
			
			char temp = s[i];
	            s[i]=s[j];
	            s[j]=temp;
			s= reverseStringArr(s,  i+1,  j-1);
			
		}
		return s;
	}  
}

