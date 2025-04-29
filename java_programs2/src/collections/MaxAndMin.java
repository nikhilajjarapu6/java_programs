package collections;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMin {
	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>();
	     Collections.addAll(al, 5, 1, 8, 3, 2, 9, 7, 4,-1,-3);
	     System.out.println("maximum : "+Collections.max(al));
	     System.out.println("minimum : "+Collections.min(al));
	}
}
