package streamAPI;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxAndMin {
	public static void main(String[] args) {
		  List<Integer> numbers = List.of(5, 10, 2, 8, 20, 15,9);
		  Optional<Integer> max = numbers.stream()
				  						 .peek(n->System.out.println("processiong "+n))
		  		 						 .max(Comparator.naturalOrder());
		  		 						
		  System.out.println("max is:"+max.get());
		  
		  Optional<Integer> min = numbers.stream()
		  		 .min(Comparator.naturalOrder());
		  System.out.println("Min is:"+min.get());
		  
		  max = numbers.stream()
		  		.reduce((x,y)->x>y?x:y);
		  System.out.println(max.get());
		  
		  max = numbers.stream()
		  		 .reduce(Integer::max);
		  System.out.println(max.get());
		  
		  //second largest
		  List<Integer> collect1 = numbers.stream()
		  		 .sorted((a,b)->b>a?b:a)
		  		 .collect(Collectors.toList());
		  System.out.println("second largest:"+collect1.get(collect1.size()-2));
		  
		  //second largest
		  Optional<Integer> first = numbers.stream()
		  		 .sorted((a,b)->Integer.compare(b,a))  //descending order
		  		 .skip(1)
		  		 .findFirst();
		  System.out.println(first.get());
		  
		  IntSummaryStatistics collect = numbers.stream()
		 		   .collect(Collectors.summarizingInt(n->n+0));
		 	System.out.println("Max :"+collect.getMax());
		 	System.out.println("Min :"+collect.getMin());
		 	System.out.println("Average :"+collect.getAverage());
		 	System.out.println("Count :"+collect.getCount());
		 	System.out.println("Sum :"+collect.getSum());
		 	
		 	int sum = numbers.stream()
		 		   .mapToInt(n->n)
		 		   .sum();
		 	System.out.println(sum);
		  		 
	}
}
