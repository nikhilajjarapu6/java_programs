package maps;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		String str="This is a test sentence and this is a test";
		Map<String,Integer> wordCount=new HashMap<>();
		String[] words=str.toLowerCase().split(" ");
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word,wordCount.get(word)+1);
			}
			else {
				wordCount.put(word,1);
			}
		}
		
		for(Map.Entry<String,Integer> entries:wordCount.entrySet()) {
			System.out.println("word \"" + entries.getKey() + "\" occured " + entries.getValue() + " times");

		}
		
	}
}
