package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Occurances {
	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<>();
		words.add("mango");
		words.add("apple");
		words.add("banana");
		words.add("kiwi");
		words.add("apple");
		words.add("orange");
		words.add("mango");
		words.add("apple");
		words.add("banana");
		words.add("kiwi");
		words.add("banana");
		words.add("null");
		
		
		int count=1;
		HashMap<String,Integer> map=new HashMap<>();
		for(String word:words) {
			if(map.containsKey(word)) {
				map.put(word,count+1);
			}
			else
				map.put(word, count);
		}
		
		System.out.println(map);
		

	}
}
