package project.leetcode.code;

public class ConsistentString {

	public static void main(String[] args) {

		String allowed = "ab";
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
		
		int count=0;
		

			for (String str : words) {
				boolean flag=false;
				for (int j = 0; j < str.length(); j++) {
					
					char ch2 = str.charAt(j);
					if(!allowed.contains(Character.toString(ch2))) {
						flag=true;
						break;
					}
					
				}
				if(!flag)count++;

			}

		
		System.out.println(count);
	}
}
