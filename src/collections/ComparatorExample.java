package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
	public static void main(String[] args) {
		Student s1=new Student(1,"rock", 2, 49);
		Student s2=new Student(4,"mack", 1, 50);
		Student s3=new Student(2,"jack", 3, 48);
		Student s4=new Student(3,"shaun", 4, 47);
		Student s5=new Student(5,"ava", 5, 43);
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		System.out.println("rank comarasion");
		Collections.sort(al,new RankComparator());
		for(Student s:al) {
			System.out.println(s.id+" "+s.name+" "+s.rank+" "+s.marks);
		}
		
		System.out.println();
		System.out.println("id comparison");
		Collections.sort(al,new IdComaparator());
		for(Student s:al) {
			System.out.println(s.id+" "+s.name+" "+s.rank+" "+s.marks);
		}
	
		
		System.out.println();
		System.out.println("name comparison");
		Collections.sort(al,Student.nameComparator());
		for(Student s:al) {
			System.out.println(s.id+" "+s.name+" "+s.rank+" "+s.marks);
		}
		
//		Collections.sort(al,new NameComparator());
//		for(Student s:al) {
//			System.out.println(s.id+" "+s.name+" "+s.rank+" "+s.marks);
//		}
	}

}
