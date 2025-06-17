package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pallindrome {
	public static void main(String[] args) {
		
		//normal java program
		String str="avvva";
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		//using collection
		List<String> words = List.of("madam", "apple", "radar", "banana", "level", "cherry","akka");
		List<String> pallindrome=new ArrayList<>();
		
		for(String word:words) {
			String pal="";
			for(int i=0;i<word.length();i++) {
				pal=word.charAt(i)+pal;
			}
			if(word.equals(pal)) {
				pallindrome.add(pal);
			}
		}
		System.out.println(pallindrome);
		
		//using streams
		List<String> collect = words.stream()
			 .filter(word->word.equals(new StringBuilder(word).reverse().toString()))
			 .collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
