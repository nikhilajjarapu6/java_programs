package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5, 1, 6,7);
		List<Integer> unique=new ArrayList<>();
		Map<Integer,Integer> map=new HashMap<>();
		for(int number:numbers) {
			if(!unique.contains(number)) {
				unique.add(number);
			}
		}
		System.out.println(unique);
		for(int number:unique) {
			int count=0;
			for(int listNumber:numbers) {
				if(number==listNumber)
					count++;
			}
			map.put(number,count);
		}
		System.out.println("count of each numbers");
		System.out.println(map);
		
		//unique ones
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.print(entry.getKey()+":"+entry.getValue()+",");
			}
		}
		
		System.out.println("\ndistict values");
		List<Integer> collect = numbers.stream()
									   .distinct()
									   .collect(Collectors.toList());
		System.out.println(collect);
	}
}
