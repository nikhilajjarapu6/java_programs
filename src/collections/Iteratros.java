package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iteratros {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=5;i++) {
			al.add(i*10);
		}
		System.out.println(al);
		ListIterator<Integer> li=al.listIterator();
		System.out.println(li.hasNext());
		System.out.println(li.next());
		System.out.println(li.nextIndex());
		System.out.println(li.next());
		System.out.println(li.hasPrevious());
		System.out.println(li.previous());
		System.out.println(li.nextIndex());
		li.remove();
		System.out.println(li);
		
	

	}

}
