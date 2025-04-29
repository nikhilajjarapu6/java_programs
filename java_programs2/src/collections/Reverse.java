package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	Collections.addAll(al,5,4,3,2,1);
	
	Collections.reverse(al);
	System.out.println(al);
}
}
