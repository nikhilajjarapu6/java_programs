package strings;

import java.util.Scanner;

public class OccuranceWord {

	public static void main(String[] args) {
		String str="hello world java1";
		Scanner r=new Scanner(System.in);
		System.out.println("enter ch to count occurance");
		String charecter=r.next();
		int count=0;
		
		if(charecter.length()>0) {
			Character ch=charecter.charAt(0);
			for(int i=0;i<str.length();i++) {
				
				if(ch==str.charAt(i))
					count++;
			}
		}
		System.out.println(count);

	}

}
