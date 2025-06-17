package maps;

import java.util.HashMap;
import java.util.Map;

public class Occurances {
	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap<>();
		String str="hello worllld";
		for(char ch:str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> entries:map.entrySet()) {
			System.out.println("charecter: "+entries.getKey()+" occurances: "+entries.getValue());
		}
	}
}
