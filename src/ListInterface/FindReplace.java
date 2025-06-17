package ListInterface;

import java.util.ArrayList;

public class FindReplace {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(12);
		numbers.add(15);
		numbers.add(34);
		numbers.add(39);
		numbers.add(46);
		
		ArrayList<Integer> even=new ArrayList<>();
		for(int number:numbers) {
			if(number%2==0)
				even.add(number);
		}
		
		System.out.println("Even numbers "+even);
	}
}
