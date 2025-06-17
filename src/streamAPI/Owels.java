package streamAPI;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Owels {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Adam", "Charlie", "Anna");
		Set<Character> owles=Set.of('a','e','i','o','u');
		Predicate<String> isOwel=(word)-> {
			System.out.println(word.toUpperCase());
			int count=0;
			for(char ch:word.toLowerCase().toCharArray()) {
				if(owles.contains(ch))
						count++;
			}
			return count>2;
		};
		List<String> collect = names.stream()
			 .filter(isOwel)
			 .collect(Collectors.toList());
		System.out.println(collect);
	}
}
