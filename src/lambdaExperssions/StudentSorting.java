package lambdaExperssions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import comparators.Student;

public class StudentSorting {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
	     students.add(new Student("John", 85,23));
	     students.add(new Student("Alice", 95,21));
	     students.add(new Student("Bob", 70,21));
	     students.add(new Student("David", 85,27));
	     students.add(new Student("Emily", 95,23));

	     System.out.println("Original list: " + students);
	     
	     //sorting based on marks
	     students.sort((student1,student2)->{
	    	 return Integer.compare(student1.getMarks(),student2.getMarks());
	     });
	     System.out.println(students);
	     
	     //sorting based on names
	     students.sort((student1,student2)->{
	    	 return student1.getName().compareTo(student2.getName());
	     });
	     System.out.println(students);
	     
	     //sortung based on both age and name
	     students.sort((student1,student2)->{
	    	 int age=Integer.compare(student1.getAge(), student2.getAge());
	    	 if(age==0) {
	    		 return student1.getName().compareTo(student2.getName());
	    	 }
	    	 return age;
	     });
	     
	     System.out.println(students);
	     
	     List<Integer> numbers = Arrays.asList(10, 20, 4, 45,99,90);
	     Integer max=Integer.MIN_VALUE;
	     Integer secondMax=Integer.MIN_VALUE;
	     for(int i=0;i<numbers.size();i++) {
	    	 if(numbers.get(i)>max) {
	    		 secondMax=max;
	    		 max=numbers.get(i);
	    	 }
	    	 else if(numbers.get(i)!=max && secondMax < numbers.get(i) ) {
	    		 secondMax=numbers.get(i);
	    	 }
	     }
	     System.out.println(max);
	     System.out.println(secondMax);
	}
	 
}
