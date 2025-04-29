package maps;

import java.util.HashMap;
import java.util.Map;

public class Merge {
	public static void main(String[] args) {
		 Map<String, Integer> map1 = new HashMap<>();
	        map1.put("A", 10);
	        map1.put("B", 20);
	        map1.put("C", 30);
	        

	        Map<String, Integer> map2 = new HashMap<>();
	        map2.put("A", 5);
	        map2.put("B", 15);
	        map2.put("D", 25);
	        map2.putAll(map1);
	        System.out.println(map2);
	}
}
