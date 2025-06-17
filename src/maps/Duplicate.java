package maps;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
	public static void main(String[] args) {
		String str="java is a high level language";
		 Map<Character, Integer> charCountMap = new HashMap<>();
		 
		 for(char ch:str.toCharArray()) {
			 // Skip spaces
	            if (ch == ' ') {
	                continue;
	            }

			 if(charCountMap.containsKey(ch)) {
				 charCountMap.put(ch,charCountMap.get(ch)+1);
			 }
			 else {
				 charCountMap.put(ch,1);
			 }
		 }
		 
		 for(Map.Entry<Character, Integer> entries:charCountMap.entrySet()) {
			 if(entries.getValue()>1) {
				  System.out.println("Character: " + entries.getKey() + " occurs " + entries.getValue() + " times");
			 }
		 }
	}
}
