package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class StudentComparators {
	public static void main(String[] args) {
		 List<Student> students = new ArrayList<>();
	        students.add(new Student("John", 85,23));
	        students.add(new Student("Alice", 95,21));
	        students.add(new Student("Bob", 70,21));
	        students.add(new Student("David", 85,27));
	        students.add(new Student("Emily", 95,23));

	        System.out.println("Original list: " + students);
	        
	        Collections.sort(students,new StudentMarks());
	        System.out.println("Students sorting based on marks:"+students);
	        
	        Collections.sort(students, new StudentNames());
	        System.out.println("Sorting Based On Student Names: "+students);
	        
	        Collections.sort(students, new Comparator<Student>() {

				public int compare(Student o1, Student o2) {
					int ageSort=Integer.compare(o1.getAge(),o2.getAge());
					return ageSort;
				}
	  
			});
	        System.out.print("Sorting based on student age:[");
	        for (Student student : students) {
	            System.out.print(student.getName()+" ("+student.getAge()+"), ");
	        }
	        System.out.println("]");
	        
	        Collections.sort(students, new DualComparator());
	        System.out.println("Sorting Based On Dual Sorting(Marks,Names): "+students);
	        
	        Collections.sort(students, new TripleCompartor());
	        System.out.println("Sorting Based On triple Sorting(Marks,Names,age): "+students);
	        System.out.println("\nStudents sorted by age:");
	        for (Student student : students) {
	            System.out.println(student.getName() + " (" + student.getMarks() + " marks, Age: " + student.getAge() + ")");
	        }
	        
	        Collections.sort(students, new DescendingSort());
	        System.out.println("\nDescending Order Based on Marks");
	        for (Student student : students) {
	            System.out.println(student.getName() + " (" + student.getMarks() + " marks, Age: " + student.getAge() + ")");
	        }
	        
	        Collections.sort(students,new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					int ageDesc=Integer.compare(o2.getAge(), o1.getAge());
					return ageDesc;
				}
	        	
			});
	        System.out.println("\nDescending Order Based on Age");
	        for (Student student : students) {
	            System.out.println(student.getName() + " (" + student.getMarks() + " marks, Age: " + student.getAge() + ")");
	        }
	        
	}
}
