package streamAPI;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfLengths {
	public static void main(String[] args) {
		 List<String> words = List.of("hello", "world", "java", "streams");
		 	Integer sum = words.stream()
		 		 .mapToInt(name->name.length())
		 		 .sum();
		 	System.out.println("sum of the lengths:"+sum);
		 	
		 	Integer reduce = words.stream()
		 		 .map(name->name.length())
		 		 .reduce(0,(a,b)->a+b);
		 	System.out.println("sum of the lengths:"+reduce);
		 	
		 	List<Integer> numbers=List.of(1,2,3,4,5,6);
		 	int sum2 = numbers.stream()
		 					  .reduce(0,(n1,n2)->n1+n2);
		 	System.out.println(sum2);
		 	
		 	IntSummaryStatistics collect = numbers.stream()
		 		   .collect(Collectors.summarizingInt(n->n+0));
		 	System.out.println("Max :"+collect.getMax());
		 	System.out.println("Min :"+collect.getMin());
		 	System.out.println("Average :"+collect.getAverage());
		 	System.out.println("Count :"+collect.getCount());
		 	System.out.println("Sum :"+collect.getSum());
	
	}
}
