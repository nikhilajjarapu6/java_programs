package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Index {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Collections.addAll(al,1,3,3,2,5,2,4,6);
//		HashSet<Integer> hashSet=new HashSet<>(al);
//		System.out.println(al.indexOf(20));
		int index=al.indexOf(2);
		String msg=(index!=-1)?"element presnted at "+index:"it is not prented";
		System.out.println(msg);
	
	}
}
