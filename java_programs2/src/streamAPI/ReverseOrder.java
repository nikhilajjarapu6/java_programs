package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {
	public static void main(String[] args) {
		//traditional way using collections
		  List<String> words = List.of("apple", "banana", "cherry", "date");
		  List<String> reverseWords =new ArrayList<>();
		  for(String word:words) {
			  String rev=new StringBuilder(word).reverse().toString();
			  reverseWords.add(rev);
		  }
		  System.out.println(reverseWords);
		  
		//streams
		  List<String> collect = words.stream()
		       .map(word->new StringBuilder(word).reverse().toString().toUpperCase())
		       .collect(Collectors.toList());
		  
		  System.out.println(collect);
		  
		  List<String> collect2 = words.stream()
		  	   .sorted((a,b)->a.compareTo(b))
		  	   .collect(Collectors.toList());
		  System.out.println(collect2);
	}
}
