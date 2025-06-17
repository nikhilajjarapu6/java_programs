package functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import comparators.Student;

public class PredictateExample {
	public static void main(String[] args) {
		//predicate takes one argument and returns boolean value
		Predicate<Integer> isEven=(num)->num%2==0; 
		
		System.out.println(isEven.test(2));
		System.out.println(isEven.test(5)?"even number":"odd number");
		
		
		//to check character is present 
		String str="hello world";
		char c='l';
		Predicate<Character> isPresent=(ch)->str.indexOf(ch)!=-1;
		System.out.println(isPresent.test(c)?"yes presnt":"no it is not presenet");
		
		
		List<String> list=Arrays.asList("Apple", "Banana", "Orange");
		String item="Appled";
		Predicate<String> isItemPresent=(it)->list.contains(it);
		System.out.println(isItemPresent.test(item));  //true or false
		
		//and method to apply to conditions
		Predicate<Integer> isPositive=(num)->num>0;
		System.out.println(isEven.and(isPositive).test(-10)); //prints true or false
		
		
		//to check string start with
		Predicate<String> isStartWith=(ch)->str.startsWith(ch);
		System.out.println(isStartWith.test("hel")?"yes":"no");
		
		
		List<Student> students=new ArrayList<>();
		students.add(new Student("John", 85,23));
        students.add(new Student("Alice", 95,21));
        students.add(new Student("Bob", 70,21));
        students.add(new Student("David", 85,27));
        students.add(new Student("Emily", 95,23));
        
        System.out.println("Students with age > 22 and marks > 35:");
        Predicate<Student> ageFilter=(student)->student.getAge()>=23;
        Predicate<Student> marksFilter=(student)->student.getMarks()>35;
        students.forEach((student)->{
        	 if (ageFilter.and(marksFilter).test(student)) {
                 System.out.print(student.getName()+"(Age:"+student.getAge()+",Marks:"+student.getMarks()+") ");
             }
        });
        
        //to find students age more than 23 or marks more than 70 using or method
        System.out.println();
        Predicate<Student> marksFilter2=(student)->student.getMarks()>85;
        students.forEach((student)->{
        	if(marksFilter2.or(ageFilter).test(student)) {
        		System.out.print(student.getName()+"(Age:"+student.getAge()+",Marks:"+student.getMarks()+") ");
        	}
        });
        
        System.out.println();
        //to find pallindrome
        Predicate<String> pallindrome=(word)->{
        	StringBuilder builder=new StringBuilder(word);
        	String reversed=builder.reverse().toString();
        	return reversed.equals(word);
        };
        System.out.println(pallindrome.test("roor")?"yes it is pallindrome":"no it is not pallindorme");
		
		
				
	}
}
