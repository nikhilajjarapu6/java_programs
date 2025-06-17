package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
//		for(int i=1;i<=5;i++) {
//			hs.add(i*10);
//		}
		hs.add(10);
		hs.add(30);
		hs.add(10);
		hs.add(50);
		hs.add(null);
		hs.add(20);
		hs.add(null);
		hs.add(10);
		hs.add(40);
		
		System.out.println(hs);		             //insertion order not reserved and growable in nature,galaxy,universe
		System.out.println(hs.clone());   
		
		Iterator<Integer> ob=hs.iterator();
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		ob.remove();
		System.out.println(ob.next());
		System.out.println(ob.next());
		System.out.println(ob.next());
		System.out.println(ob.next());
		System.out.println(ob.next());
	//	System.out.println(ob.next());  no such element exception
		
		LinkedHashSet<Integer> li=new LinkedHashSet<>();
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(null);
		li.add(null);
		li.add(30);
		System.out.println(li);
		
		
		
		TreeSet<Integer> tr=new TreeSet<>(hs);
		System.out.println(tr);		//automatic sorted format
		System.out.println(tr.ceiling(100));
		System.out.println(tr.floor(10));
		
		
		
	}

}
