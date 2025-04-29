package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int marks;
    private int age;

    // Constructor
    public Student(String name, int marks,int age) {
        this.name = name;
        this.marks = marks;
        this.age=age;
    }

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")"+"Age ("+age+")";
    }
    
 

}


class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		int marksOrder=Integer.compare(o1.getMarks(),o2.getMarks());
		return marksOrder;
	}
	
}



public class ComparatorEx {

	public static void main(String[] args) {
		  List<Student> students = new ArrayList<>();
	        students.add(new Student("John", 85,22));
	        students.add(new Student("Alice", 95,23));
	        students.add(new Student("Bob", 70,22));
	        students.add(new Student("David", 85,21));
	        students.add(new Student("Emily", 95,24));

	        System.out.println("Original list: " + students);
	        
	        Collections.sort(students,new StudentComparator());
	        
	        System.out.println("Sorted list: " + students);
	        
	        Collections.sort(students,new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					int agecomp=Integer.compare(o1.getAge(),o2.getAge());
					if(agecomp==0) {
						return o1.getName().compareTo(o2.getName());
					}
					return agecomp;
				}
			});
	        System.out.println("Sorted list: " + students);
	}

}

