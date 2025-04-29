package streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfWords {
	public static void main(String[] args) {
		List<String> names = List.of("Alice", "Bob", "Adam", "Charlie", "Anna");
		List<String> lengths = names.stream()
			 .map(name->name+"-"+name.length())
			 .collect(Collectors.toList());
		
		System.out.println(lengths);
		
		//alternative way using maps
		Map<String, Integer> nameLength = names.stream()
			 .collect(Collectors.toMap(name->name,name->name.length()));
		for(Map.Entry<String,Integer> map:nameLength.entrySet()) {
			System.out.print(map.getKey()+":"+map.getValue()+" ");
		}
		
		nameLength.forEach((name,length)->System.out.print(name+":"+length+" "));
		
		
	}
}
