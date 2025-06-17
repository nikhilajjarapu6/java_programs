package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Collections.addAll(al,1,2,3,4,5,6,2,4,1,4,2,4,5,8,4,7);
		
		TreeSet<Integer> treeSet=new TreeSet<>(al);
		System.out.println(treeSet);
		
	}
}
