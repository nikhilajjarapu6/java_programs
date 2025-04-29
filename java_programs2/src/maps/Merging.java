package maps;

import java.util.HashMap;
import java.util.Map;

public class Merging {
	public static void main(String[] args) {
		    Map<String, Integer> map1 = new HashMap<>();
	        map1.put("Apple", 10);
	        map1.put("Banana", 20);
	        
	        Map<String, Integer> map2 = new HashMap<>();
	        map2.put("Orange", 30);
	        map2.put("Banana", 40);
	        
	        //putall over writes key values
//	        map1.putAll(map2);
//	        System.out.println(map1);
//	        
	       
	        //merge method will add values of duplicate keys not over writes
	        map2.forEach((k,v)->map1.merge(k, v, Integer::sum));
	        System.out.println(map1);
	        
	       
	}
}
