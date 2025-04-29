package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	//this is example for comaprable interface
		public static void main(String[] args) {
			Student s1=new Student(1,"rock", 2, 49);
			Student s2=new Student(4,"mack", 1, 50);
			Student s3=new Student(2,"jack", 3, 48);
			Student s4=new Student(3,"shaun", 4, 47);
			
			ArrayList<Student> al=new ArrayList<>();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al.add(s4);
			Collections.sort(al);
//			System.out.println(al);
			for(Student s:al) {
				System.out.println(s.id+" "+s.name+" "+s.rank+" "+s.marks);
				
			}
		}
}
