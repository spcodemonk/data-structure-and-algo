package project.leetcode.code;

import java.util.TreeMap;
import java.util.stream.Stream;

public class CountWithPrefix {

	public static void main(String[] args) {
		String [] words = {"pay","attention","practice","attend"};
		String pref = "at";
		
		
		System.out.println(Stream.of(words).filter(word -> word.startsWith(pref)).count());
		
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(1,"India");
		m.put(2,"US");
		m.put(3,"Australia");
		m.put(4,"Netherlands");
		m.put(5,"Canada");
		
		
	}

}
