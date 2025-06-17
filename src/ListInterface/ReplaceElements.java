package ListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElements {
	public static void main(String[] args) {
		 ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Red");
	     System.out.println("original list "+colors);
	     
	     //replaces all elements
	     Collections.replaceAll(colors,"Red","RED");
	     System.out.println(colors);
	     
	     
	     
	     for(int i = 0; i < colors.size(); i++) {
	            String color = colors.get(i);
	            // Replace 'e' with 'E' in each string
	            color = color.replace('e', 'E');
	            colors.set(i, color);
	        }

	    System.out.println("List after replacement: " + colors);
	}
}
