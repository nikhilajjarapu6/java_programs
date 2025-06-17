package collections;

import java.util.ArrayList;

public class LikedList {

	public static void main(String[] args) {
//		Scanner r=new Scanner(System.in);
//		LinkedList<Integer> li=new LinkedList<>();
//		li.add(10);
//		//li.add("hello");
//		li.add(20);
//		li.add(30);
//		li.add(40);
//		li.add(50);
//		System.out.println(li);
//		
//		System.out.println(li.get(1));
//		li.push(60);
//		System.out.println(li);
//		System.out.println(li.pop());
//		System.out.println(li.contains(10));
//		System.out.println(li.isEmpty());
//		System.out.println(li.indexOf(20));
//		System.out.println(li.getFirst());
//		System.out.println(li.getLast());
//		System.out.println(li);
//		
//		LinkedList<Integer> ll=new LinkedList<>();
//		for(int i=0;i<5;i++) {
//			System.out.println("enter"+i+" element");
//			ll.add(r.nextInt());
//		}
//		System.out.println(ll);
//		
//		li.addAll(li.size(), ll);
//		System.out.println(li);
//		System.out.println(li.size());
//		System.out.println(ll.size());
//		
//		ArrayList<Integer> al=new ArrayList<>(ll);
//		System.out.println(al);
		
		
		ArrayList<String> list=new ArrayList<>();
		list.add("lwey");
		list.add("wey");
		list.add("kgkuwey");
		list.add("lwekjqy");
		list.add("gwey");
		
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			charecter(list.get(i));
		}
		
	}

	private static void charecter(String string) {
		
			if(string.charAt(0)=='l'||string.charAt(0)=='L')
				System.out.println(string);
		
		
	}

}
