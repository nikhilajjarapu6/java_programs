package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {
	public static void main(String[] args) {
		//this is nested list
		 List<List<Integer>> nestedList = List.of(
		            List.of(1, 2, 3),
		            List.of(4, 5),
		            List.of(6, 7, 8)
		        );
		 
		 //it will return list of list
		 List<List<Integer>> collect = nestedList.stream()
		 		   .collect(Collectors.toList());
		 System.out.println(collect);
		 
		 //it converts the stream of streams to single stream
		 List<Integer> list2 = nestedList.stream()
				   .peek(list -> System.out.println("Before mapping: " + list)) 
		 		   .flatMap(list->list.stream())     //list into single stream
		 		   .peek(list->System.out.println("after mapping "+list))  
		 		   .toList();
		 System.out.println(list2);
		 
		 
		 List<List<List<Integer>>> nestedList2 = List.of(
		            List.of(List.of(1, 2), List.of(3, 4)),
		            List.of(List.of(5, 6)),
		            List.of(List.of(7, 8, 9))
		        );
		 
		 List<Integer> flattenedList = nestedList2.stream()
				 	.peek(outer->System.out.println("outer list "+outer))
		            .flatMap(list -> list.stream())  // Flatten the outer list
		            .peek(inner->System.out.println("inner list "+inner))
		            .flatMap(innerList -> innerList.stream())  // Flatten the inner lists
		            .peek(finallist->System.out.println("final list "+finallist))
		            .collect(Collectors.toList());

		        System.out.println("Flattened list: " + flattenedList);

		        
		        List<String> stringList = List.of("hello", "world", "java");
		        
		        List<Character> charStream = stringList.stream()
		        		  .flatMap(s->s.chars()
		        				  .peek(charr->System.out.println("processing char"+charr))
		        				  	.mapToObj(c->(char)c))
		        		  .toList();
		        System.out.println(charStream);
		        		  
	}
}	
