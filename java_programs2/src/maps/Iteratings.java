package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iteratings {
	public static void main(String[] args) {
		 Map<String, String> countries = new HashMap<>();
	        countries.put("USA", "Washington, D.C.");
	        countries.put("India", "New Delhi");
	        countries.put("China", "Beijing");
	        countries.put("Japan", "Tokyo");
	        
	    //iterating through entry set
	        System.out.println("iterating through entry set");
	       for(Map.Entry<String,String> entries:countries.entrySet()) {
	    	   System.out.println("Country: "+entries.getKey()+" capital: "+entries.getValue());
	       }
	   //iterating through keyset
	       System.out.println("iterating through keyset");
	       for(String key:countries.keySet()) {
	    	   System.out.println("Country: "+key +" capital: "+countries.get(key));
	       }
	      
	   //iterating using iterator
	       System.out.println("iterating using iterator");
	       Iterator<Map.Entry<String,String>> iterator=countries.entrySet().iterator();
	       while(iterator.hasNext()) {
	    	   Map.Entry<String,String> entry=iterator.next();
	    	   System.out.println("Country: "+entry.getKey()+" capital: "+entry.getValue());
	       }
	}
}
