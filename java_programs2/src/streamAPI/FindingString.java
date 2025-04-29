package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class FindingString {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Adam", "Charlie", "Anna");
		List<String> collection = names.stream()
			 .filter(name->name.startsWith("A"))
			 .collect(Collectors.toList());
		
		System.out.println(collection);
		
			List<String> collect = names.stream()
				 .filter(n->n.length()>4)
				 .sorted((a,b)->b.compareTo(a))    //printing in descending order
				 .collect(Collectors.toList());
			System.out.println(collect);
	}
}
