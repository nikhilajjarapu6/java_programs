package streamAPI;

import java.util.List;
import java.util.Optional;

public class AdditionalMethods {
	public static void main(String[] args) {
		
		 //find first - returns first element of filtered elements
		 //find any   - returns any element of filtered elements(mostly first)
		 //all match  - returns true if all elements follows the condition
		 //any match  - returns true if any of element follows the condition
		 //none match - returns true if no element follows the condition
		 //to array   - converts the stream into array
		
		 List<Integer> numbers = List.of(3, 6, 8, 9, 12,20, 15, 18);
		 
		 //finding first even number
		 Optional<Integer> first = numbers.stream().filter(n->n%2==0).findFirst();
		 first.ifPresent(n->System.out.println(n));
		 
		 //finding any odd number
		 Optional<Integer> odd = numbers.stream().filter(n->n%2!=0).findFirst();
		 odd.ifPresent(n->System.out.println(n));
		 
		 //finding any number that divisible with 5
		 Optional<Integer> any = numbers.stream().filter(n->n%5==0).findAny();
		 any.ifPresent(System.out::println);
		 
		 //check the number are positive
		 Optional<Integer> positive = numbers.stream().filter(n->n>0).findAny();
		 positive.ifPresent(System.out::println);
		 
		 //check the all the numbers are positive
		 boolean allMatch = numbers.stream().allMatch(n->n>0);
		 System.out.println("all numbers are positive? "+allMatch);
		 
		 //converting to array
		 Integer[] array = numbers.stream().toArray(n->new Integer[n]);
		 for(int a:array) {
			 System.out.print(a+" ");
		 }
		 
		 List<String> names = List.of("Alice", "Bob", "Charlie");
		 Optional<String> any2 = names.stream().findAny();
		 any2.ifPresent(System.out::println);
		 
		 boolean allMatch2 = names.stream().allMatch(n->n.length()>3);
		 System.out.println(allMatch2);
		 
		 Optional<String> first2 = names.stream().filter(n->n.length()>3).findFirst();
		 first2.ifPresent(System.out::println);
		 
		 //converting stream to array
		 String[] array2 = names.stream().toArray(String[]::new);
		 for(String name:array2) {
			 System.out.println(name);
		 }
		
	}
	
}
