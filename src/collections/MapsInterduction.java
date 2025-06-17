package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MapsInterduction {

    public static void main(String[] args) {
    	 HashMap<Integer,Integer> hashMap=new HashMap<>();
    	 hashMap.put(1, 100);
    	 hashMap.put(2, 200);
    	 hashMap.put(3, 300);
    	 hashMap.put(4, 400);
    	 hashMap.put(5, 500);
    	 
    	 System.out.println(hashMap);
    	 System.out.println(hashMap.get(1));      //returns key corresponding value
    	 System.out.println(hashMap.containsKey(1)); //boolean value
    	 System.out.println(hashMap.containsValue(100)); //boolean
    	 System.out.println(hashMap.size()); //size of map
    	 System.out.println(hashMap.keySet());  //complete key list
    	 System.out.println(hashMap.values());  //complete values list
    	 
    	 ArrayList<Integer> al=new ArrayList<>();
    	 al.addAll(hashMap.keySet());
    	 Collections.reverse(al);
    	 System.out.println(al);
    	 
    	for(int a:hashMap.keySet()) {
    		System.out.println(a+":"+hashMap.get(a));
    	}
    	
    	for(int a:hashMap.values()) {
    		System.out.println(a+":"+hashMap.get(a));
    	}
    	 
    	for(Entry<Integer,Integer> a:hashMap.entrySet()) {
    		System.out.println(a);
    	}
    	
    	for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()) {
    		 System.out.println(entry);
    	}
    	
    	
    	
    	  Map<String, Integer> map = new ConcurrentHashMap<>();
          map.put("Alice", 30);
          map.put("Bob", 25);
          map.put("Charlie", 35);
          map.forEach((key, value)-> System.out.println(key + " : " + value));

    }


}
