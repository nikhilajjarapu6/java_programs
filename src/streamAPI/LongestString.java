package streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
	public static void main(String[] args) {
		 List<String> words = List.of("apple", "banana", "cherry", "blueberry", "pineapple");
		 String str="";
		 for(String word:words) {
			 if(word.length()>str.length()) {
				 str=word;
			 }
		 }
		 System.out.println(str);
		 
		 Optional<String> max = words.stream()
				 					 .max(Comparator.comparing(word->word.length()));
		 System.out.println(max.get());
		 
		 String longest = words.stream()
                 			.reduce("", (a, b) -> a.length() > b.length() ? a : b);
                            System.out.println(longest);

		 	  
	}
}
