package project.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class CharacterToHashMap {

	public static void main(String[] args) {

		String s ="aaabb";

		char ch[] = s.toCharArray();

		Map<Character,Integer>mapData=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			
			if(mapData.containsKey(ch[i])) {
				mapData.put(ch[i], mapData.getOrDefault(ch[i], 0)+1);
			}else {
				mapData.put(ch[i], 1);
			}
			
		}
		
		int first = mapData.get(ch[0]);
		
		for(int i:mapData.values()) {
			
			if(first!=i) {
				System.out.println("stop");
			}
		}
		
		System.out.println("finish");
	}

}
