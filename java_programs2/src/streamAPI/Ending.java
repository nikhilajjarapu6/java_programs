package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Ending {
	public static void main(String[] args) {
		  List<String> words = List.of("hello", "world", "java", "stream","lava");
		  List<String> collect = words.stream()
		  	   .filter(word->word.endsWith("a"))
		  	   .collect(Collectors.toList());
		  System.out.println(collect);
	}
}
