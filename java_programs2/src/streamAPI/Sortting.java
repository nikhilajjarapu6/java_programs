package streamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sortting {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 10, 2, 8, 20, 15);
		
		//sorting in ascending order
		List<Integer> ascending = numbers.stream()
			   .sorted()
			   .collect(Collectors.toList());
		System.out.println("ascending orderd of numbers");
		System.out.println(ascending);
		
		//descending order
		List<Integer> descending = numbers.stream()
			   .sorted(Comparator.reverseOrder())
			   .collect(Collectors.toList());
		System.out.println("descending order of numbers");
		System.out.println(descending);
		
		Map<String,Integer> students=new HashMap<>();
		students.put("Alice", 21);
		students.put("Bob", 24);
		students.put("Anna", 22);
		students.put("Chris", 23);
		students.put("Dave", 23);
		
		System.out.println("sorting based on keys reverse");
		students.entrySet().stream()
						   .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
						   .forEach(System.out::println);
		
		System.out.println("sorting based on keys");
		students.entrySet().stream()
						   .sorted(Map.Entry.comparingByKey())
						   .forEach(System.out::println);
		
	
		
		System.out.println("sorting basaed on values");
		students.entrySet().stream()
						   .sorted(Map.Entry.comparingByValue())
						   .forEach(System.out::println);
		
		System.out.println("sorting basaed on values in reverse order");
		students.entrySet().stream()
						   .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
						   .forEach(System.out::println);
		
		//custom comparators
		System.out.println("custom comparator");
		students.entrySet().stream()
						   .sorted((a,b)->a.getKey().compareTo(b.getKey()))
						   .forEach(System.out::println);
		
		System.out.println("custom comparator for values");
		students.entrySet().stream()
						   .sorted((a,b)->Integer.compare(a.getValue(),b.getValue()))
						   .forEach(System.out::println);
		
		System.out.println("sorting based on both name and value");
		students.entrySet().stream()
						   .sorted((a,b)->{
							   int age=Integer.compare(a.getValue(),b.getValue());
							   if(age==0) {
								   return a.getKey().compareTo(b.getKey());
							   }
							   return age;
						   })
						   .forEach(System.out::println);
	}
}
