package streamAPI;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Unique {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5, 1, 6,7,1);
		Map<Integer, Long> occurrences = numbers.stream()
										    .collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
		//unique values
		List<Entry<Integer, Long>> unique = occurrences.entrySet().stream()
							  .filter(entry->entry.getValue()==1)
							  .collect(Collectors.toList());
		System.out.println("unique elements from numbers "+unique);
		
		int n=2;
		List<Entry<Integer, Long>> occurTwice = occurrences.entrySet().stream()
							  .filter(entry->entry.getValue()==n)
							  .collect(Collectors.toList());
		System.out.println("Two times occured elements from numbers "+occurTwice);
		
		//more than two
		List<Integer> noOfOcc = occurrences.entrySet().stream()
							  .filter(entry->entry.getValue()>=3)
							  .map(entry->entry.getKey())  // .map(Map.Entry::getKey) alternative way
							  .collect(Collectors.toList());
		System.out.println(noOfOcc);
		 
	}
}
