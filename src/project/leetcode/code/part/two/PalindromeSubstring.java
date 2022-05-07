package project.leetcode.code.part.two;

public class PalindromeSubstring {
	
	static  int resultStart;
	static   int resultLength;
	public static void main(String[] args) {
		
		String s = "cbbd";
		
		
		String str = longestPalindrome( s);
		
		System.out.println(str);
		
	}
	 public static String longestPalindrome(String s) {
			if(s.length()<2) {
				System.out.println(s);
			}
	        
		 for(int start=0;start<s.length();start++) {
				
				checkRanges(s,start,start);
				checkRanges(s,start,start+1);
				
				
			}
		 return s.substring(resultStart,resultStart+ resultLength);
	    }
	 

	private static  void checkRanges(String s, int start, int end) {
		
		while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)) {
			
			start--;
			end++;
		}
		
		if(resultLength< end-start-1) {
			resultStart=start+1;
			resultLength= end-start-1;
		}
		
	}

}
