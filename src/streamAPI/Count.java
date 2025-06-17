package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Count {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 25, 30, 40, 50, 15,22,100);
		long count = numbers.stream()
						    .filter(n->n>25)
						    .count();
		System.out.println("count of greater than 25:"+count);
		
		long evenCount = numbers.stream()
								.filter(n->n%2==0)
								.count();
		System.out.println("count of even numbers:"+evenCount);
		
		long fivecount = numbers.stream()
								.filter(n->n%5==0 || n%5==5)
							    .count();
		System.out.println(fivecount);
		
		long countOfSquares = numbers.stream()
								     .filter(n->Math.sqrt(n)==Math.floor(Math.sqrt(n)))
								     .count();
		System.out.println("count of perfect squares:"+countOfSquares);
		
		List<Integer> listOfSquares = numbers.stream()
			     						     .filter(n->Math.sqrt(n)==Math.floor(Math.sqrt(n)))
			     						     .collect(Collectors.toList());
		System.out.println(listOfSquares);
		
		List<Integer> sumOfDigits = numbers.stream()
			   .filter(n->{
				   int sum = 0;
                   int temp = n; 
                   while (temp > 0) {
                       int r = temp % 10;
                       sum += r;
                       temp /= 10;
                   }
                   System.out.println("Sum of digits for " + n + " is " + sum);
                   return sum % 2 == 0; // Check if the sum is even
			   })
			   .collect(Collectors.toList());
		
		System.out.println(sumOfDigits);
		
			Integer sumOfEven = numbers.stream()
				   .filter(n->n%2==0)
				   .map(n->n*n)
				   .reduce(0,(a,b)->a+b);
			System.out.println(sumOfEven);
		
	}
}
