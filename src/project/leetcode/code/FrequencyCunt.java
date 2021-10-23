package project.leetcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCunt {

	public static void main(String[] args) {

		String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is" };

		int k = 4;

		Map<Object, Long> data = Arrays.asList(words).stream().collect(Collectors.groupingBy(obj -> obj, Collectors.counting()));

		ArrayList<frquency> list = new ArrayList<>();

		for (Map.Entry<Object, Long> entry : data.entrySet()) {

			String wordname = (String) entry.getKey();

			int frqc = Integer.parseInt(entry.getValue().toString());

			frquency f1 = new frquency(wordname, frqc);

			list.add(f1);
		}		
		
		Collections.sort(list);
		
		ArrayList<String> finalData = new ArrayList<>();
		
		for (int i = 0; i < k; i++) {

			finalData.add(list.get(i).word);
		}
		
		System.out.println(finalData);


	}


}

class frquency implements Comparable {

	int freq;
	String word;

	public frquency(String word, int freq) {

		this.freq = freq;
		this.word = word;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "frquency [freq=" + freq + ", word=" + word + "]";
	}

	@Override
	public int compareTo(Object o) {

		frquency frc = (frquency) o;
		if (this.freq == frc.freq) {
			return this.word.compareTo(frc.word);
		}else if(this.freq > frc.freq) {
			return -1;
		}
		
		return 	1;
		
		
	}
	

}
