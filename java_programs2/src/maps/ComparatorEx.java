package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorEx {
	public static void main(String[] args) {
		  Map<String, Integer> studentMap = new HashMap<>();
	        studentMap.put("Alice", 85);
	        studentMap.put("Bob", 75);
	        studentMap.put("Charlie", 85);
	        studentMap.put("David", 90);
	        studentMap.put("Eve", 90);
	        studentMap.put("Frank", 75);
	     System.out.println("before sort");
	     List<Map.Entry<String,Integer>> arrayList=new ArrayList<>(studentMap.entrySet());
	     Collections.sort(arrayList, new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int marksCompare=o1.getValue().compareTo(o2.getValue());
				if(marksCompare==0) {
					return o1.getKey().compareTo(o1.getKey());
				}
				return marksCompare;
			}
	    	 
		});
	     
	     System.out.println("after sort");
	     System.out.println(arrayList);
	}
}
