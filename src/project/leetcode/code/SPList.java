package project.leetcode.code;

import java.util.ArrayList;
import java.util.List;

public class SPList {

	public static void main(String[] args) {
		String s1 = "qwertyuiop";
		String s2 = "asdfghjkl";
		String s3 = "zxcvbnm";

		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		String searchString="";
		List<String> data = new ArrayList<>();
		for (String word : words) {
			
			boolean flag=true;
			String ch = Character.toString(word.charAt(0)).toLowerCase();
			if(s1.contains(ch)) {
				searchString=s1;
			}else if(s2.contains(ch)) {
				searchString=s2;
			}else if(s3.contains(ch)) {
				searchString=s3;
			}
			
			for (int i = 0; i < word.length(); i++) {
				
				if(!searchString.contains( Character.toString(word.charAt(i)).toLowerCase())) {
					flag=false;
				}
				
			}
			
			if(flag) {
				data.add(word);
			}
			

		}
		
		
		System.out.println(data);

	}

}
