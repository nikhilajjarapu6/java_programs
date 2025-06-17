package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Sort {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	Collections.addAll(al,-3,4,2,5,6,3,1,6,8,5);
	Collections.sort(al);
	System.out.println(al);
	
	TreeSet<Integer> set=new TreeSet<>(al);
	System.out.println(set);
	
	
	
}
}
