package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		// using list creating stream
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> streamOfNumbers = numbers.stream();
		System.out.println(streamOfNumbers); // reference of stream pipe line
		streamOfNumbers.forEach(num -> System.out.println(num));

		// once stream is already used we cannot use the stream again
		// if we try to access again we will get exception
		// streamOfNumbers.forEach(num->System.out.println(num));

		// using array
		String[] a = { "A", "B", "C" };
		Stream<String> stream = Arrays.stream(a);
		stream.forEach(ch -> System.out.print(ch + " "));

		// using list
		List<String> names = List.of("Alice", "Bob", "Charlie");
		names.stream().forEach(name -> System.out.println(name));
		
		//generating using stream of method
		Stream<Integer> ofNumbers = Stream.of(1,2,3,4,5);
		ofNumbers.forEach(n->System.out.println(n));
		
		
		//generating infinite streams 
//		Stream<Object> stream2 = Stream.generate(()->Math.floor(Math.random()*10));
//		stream2.forEach(System.out::println);
		
        // Generate an infinite stream of random integers (0 to 9) and limit it to 10 numbers
        Stream<Integer> integerStream = Stream.generate(() -> (int)(Math.random() * 10));
        
        // Limit the stream to 10 numbers and print them
        integerStream.limit(10).forEach(System.out::print);
        
        //generating hello word
        Stream.generate(()->"hello streams")
        	  .limit(5)
        	  .forEach(System.out::println);

		
		//generating using iterate
        Stream.iterate(1,n->n+1)
        		.limit(10)
        		.forEach(System.out::println);
        
        //generating sqaures of numbers
        Stream<Integer> streamOfSquares = Stream.iterate(1, n ->{
        	System.out.println("iterating number "+n);
        	return n+1;
        });
		streamOfSquares.limit(10)
					   .map(n->{
						   System.out.println("mapping number "+n);
						   return n*n;
						 })
					   .forEach(System.out::println);

	}
}
