package project.leetcode.code.part.two;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "aaaaaa", t = "bbaaaa";
		
		int count=0;
		int j =0;
		for(int i=0;i<s.length();i++) {
				
				
				
				while(j<t.length()) {
					
					if(s.charAt(i)==t.charAt(j)) {
						count++;
						j++;
						break;
					}else {
						j++;
					}
					
				}
		}
		System.out.println(count);
	}

}
