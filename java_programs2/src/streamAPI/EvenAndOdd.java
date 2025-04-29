package streamAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenAndOdd {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5);
		List<Integer> oddNumbers = numbers.stream()
								    .filter(n->n%2!=0)
								    .collect(Collectors.toList());
		
		
		List<Integer> evenNumbers = numbers.stream()
											.filter(n->n%2==0)
											.collect(Collectors.toList());
		System.out.println(oddNumbers);
		System.out.println(evenNumbers);
		
		
		//using partitioned 
		Map<Boolean, List<Integer>> partitioned = numbers.stream()
			   .collect(Collectors.partitioningBy(n->n%2==0));
		List<Integer> even = partitioned.get(true);
		List<Integer> odd = partitioned.get(false);
		System.out.println(even);
		System.out.println(odd);
		
		
		//using predicate
		Predicate<Integer> isEven=n->n%2==0;
		Predicate<Integer> isOdd=isEven.negate();  //opposite of is even
		 oddNumbers = numbers.stream()
							    .filter(isOdd)
							    .collect(Collectors.toList());
		 evenNumbers = numbers.stream()
								.filter(isEven)
								.collect(Collectors.toList());
				
		 System.out.println(oddNumbers);
		 System.out.println(evenNumbers);
	}
	
}
