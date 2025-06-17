package streamAPI;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupBy {
	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "cherry", "date", "kiwi", "mango");
		Map<Integer, List<String>> collect = words.stream()
						                          .collect(Collectors.groupingBy(word->word.length()));
		
		collect.forEach((l,w)->System.out.println("length:"+l+" words:"+w));
		
		
		for(Entry<Integer, List<String>> entry:collect.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
