package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Unique {
	public static void main(String[] args) {
		String str="java is a high level language";
		 Map<Character, Integer> charCountMap = new HashMap<>();
		 for(char ch:str.toCharArray()) {
			 if(ch==' ') {
				 continue;
			 }
			 if(charCountMap.containsKey(ch)) {
				 charCountMap.put(ch,charCountMap.get(ch)+1);
			 }
			 else {
				 charCountMap.put(ch,1);
			 }
		 }
		 
		 System.out.println("Unique characters from the string:");
		 for(Entry<Character, Integer> entries:charCountMap.entrySet()) {
			 if(entries.getValue()==1) {
				  System.out.println("Character: " + entries.getKey() + " occurs " + entries.getValue() + " times");
			 }
		 }
		 
		 System.out.println("\nduplicate characters from the string:");
		 for(Entry<Character, Integer> entries:charCountMap.entrySet()) {
			 if(entries.getValue()>1) {
				  System.out.println("Character: " + entries.getKey() + " occurs " + entries.getValue() + " times");
			 }
		 }
		 
	}
}
