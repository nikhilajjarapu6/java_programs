package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Basics {
	public static void main(String[] args) {
		Map<String,Integer> population=new HashMap<>();
		population.put("USA", 331002651);
		population.put("India", 1380004385);
		population.put("China", 1439323776);
        population.put("Brazil", 212559417);
        population.put("Pak",331002652 );
        
        System.out.println(population);
        
        Map<String,Integer> treemap=new TreeMap<>(population);  //creates tree map with asscending order
        System.out.println(treemap);    
        
        Map<String,Integer> linkedMap=new LinkedHashMap<>(population);  //creates map with order or insertion
        System.out.println(linkedMap);
        
        System.out.println(population.get("USA")+" People");  //to get the value by key
        System.out.println(population.remove("Pak"));		  //removes the particular object by using key
        
        population.replace("Pak",33100000);   //replaces the value
        
        System.out.println(population.containsKey("India"));  //return boolean value
        System.out.println(population.containsValue(331002651)); //return boolean value
        
        System.out.println(population.size()); //returns size of the map
        
        System.out.println(population.keySet());  //returns set of keys
        System.out.println(population.values());  //returns values of map
        Set<String> keys=population.keySet();
        System.out.println(keys);
        Collection<Integer> values=population.values();  //returns collection of values
        System.out.println(values);
        
        //iterating maps
        for(Map.Entry<String, Integer> entries:population.entrySet()) {
        	System.out.println(entries);
        }
        
      //iterating maps and accessing keys and values
        for(Map.Entry<String, Integer> entries:population.entrySet()) {
        	System.out.println("country : "+entries.getKey()+" and its population : "+entries.getValue());
        }
	}
}
