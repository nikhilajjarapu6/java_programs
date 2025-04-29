package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Unique {
	public static void main(String[] args) {
		String str="java is high level language";
		Set<Character> chars=new HashSet<>();
		Set<Character> linked=new LinkedHashSet<>();
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				continue;
			}
			chars.add(ch);
			linked.add(ch);
		}
		
		System.out.println(chars);
		System.out.println(linked);
	}
}
