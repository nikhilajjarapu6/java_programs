package comparators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterartorEx {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Mango");
	        list.add("Papaya");
	        
	      Iterator<String> iterator=list.iterator();
	      System.out.println(iterator);
	      int i=1;
	      while(iterator.hasNext()) {
	    	  System.out.println(i+"."+iterator.next());
	    	  i++;
	      }
	      
	      // Reset the iterator to the beginning of the list
	        iterator = list.iterator();

	        // Remove the element "Papaya"
	        while (iterator.hasNext()) {
	            if (iterator.next().equals("Papaya")) {
	                iterator.remove();
	            }
	        }

	        System.out.println("List after removing 'Papaya':");
	        System.out.println(list);
	    }
	}

