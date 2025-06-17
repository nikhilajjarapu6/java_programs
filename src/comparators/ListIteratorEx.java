package comparators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		   List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Mango");
	        list.add("Papaya");
	        
	       ListIterator<String> iterator=list.listIterator();
	       while(iterator.hasNext()) {
	    	   System.out.print(iterator.next()+" ");
	       }
	       
	       System.out.println("\nbackword iteration");
	       while(iterator.hasPrevious()) {
	    	   System.out.print(iterator.previous()+" ");
	       }
	     //now cursor is  at the beginning
	       
	       System.out.println("\nindexes");
	       while(iterator.hasNext()) {
	    	   System.out.println(iterator.nextIndex()+" "+iterator.next()+" "+iterator.previousIndex());
	       }
	       //cursor is at the end
	       System.out.println("\n positions");
	       while(iterator.hasPrevious()) {
	    	   System.out.println(iterator.previousIndex()+" "+iterator.previous()+" "+iterator.nextIndex());
	       }
	       //now cursor is  at the beginning
	       System.out.println("\nadding elements at start");
	       if(iterator.hasNext()) {
	    	   iterator.add("Grapes");
	       }
	       System.out.println(list+" "+iterator.nextIndex());
	       
	}
}
