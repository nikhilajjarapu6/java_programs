package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sorting {
	public static void main(String[] args) {
		  Map<String, Integer> items = new HashMap<>();
	        items.put("Banana", 50);
	        items.put("Apple", 120);
	        items.put("Orange", 90);
	        items.put("Mango", 70);
	        System.out.println("before sort");
	        System.out.println(items);
	        System.out.println("after sort");
	        Map<String,Integer> sortedItems=new TreeMap<>(items);
	        System.out.println(sortedItems);	//sorted based on keys
	        
	        System.out.println("sorting based on values");
	        List<Map.Entry<String,Integer>> values=new ArrayList<>(items.entrySet());
	        values.sort(Map.Entry.comparingByValue());
	        for (Map.Entry<String, Integer> entry : values) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	}
}	
