package collections;

import java.util.HashMap;
import java.util.Map;

public class CharectersCount {

	public static void main(String[] args) {
		 String str = "programming";
  	   
  	   HashMap<Character,Integer> map=new HashMap<>();
  	   
  	   for(char letter:str.toCharArray()) {
  			   map.put(letter,map.getOrDefault(letter,0)+1);
  			   
  	   }
  	   System.out.println(map);
  	   for(Map.Entry<Character,Integer> entry:map.entrySet()) {
  		   if(entry.getValue()>1)
  			   System.out.println(entry.getKey()+":"+entry.getValue());
  	   }
  	
  

	}

}
