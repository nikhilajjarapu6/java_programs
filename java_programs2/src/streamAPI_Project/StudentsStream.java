package streamAPI_Project;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsStream {
	public static void main(String[] args) {
		List<Student> students = StudentDatabase.getStudents();
		System.out.println(students);
		
		//no of students
		Long noOfStudents = students.stream()
			    .collect(Collectors.counting());
		System.out.println("no of students :"+noOfStudents);
		
		
		//student name and age
		System.out.println("students names and age...............");
		students.stream()
			    .forEach(student->System.out.println(student.getName()+" and age :"+student.getAge()));
		
		//students above 20 age
		System.out.println("students above age 20");
		List<Student> majors = students.stream()
		        .filter(s->s.getAge()>18)
		        .collect(Collectors.toList());
		majors.forEach(s->System.out.println(s.getName()+" : "+s.getAge() ));
		
		//sorting based on age
		System.out.println("students ascending order based on age...............");
		List<Student> ageSort = students.stream()
			    .sorted((o1,o2)->Integer.compare(o1.getAge(), o2.getAge()))
			    .toList();
		ageSort.forEach(s->System.out.println(s.getName()+" and age :"+s.getAge()));
		
		//students and cources
		System.out.println("skill ratings....................");
		students.stream()
				.forEach(s->System.out.println(s.getName()+" : "+s.getSkillRatings()));
		
		//active students
		System.out.println("...............................");
		List<Student> activeStudents = students.stream()
			    .filter(s->s.isActive())
			    .collect(Collectors.toList());
		
		activeStudents.forEach(l->System.out.println(l.getName()));
		
		//older student
		System.out.println("...............................");
		Optional<Student> max = students.stream()
				.max((o1,o2)->Integer.compare(o1.getAge(), o2.getAge()));
		System.out.println(max.get().getName()+" is older student with age of "+max.get().getAge());
		
		//elder student
		Optional<Student> min = students.stream()
				.max((o1,o2)->Integer.compare(o2.getAge(), o1.getAge()));
		System.out.println(min.get().getName()+" is elder student with age of "+min.get().getAge());
		
		//unique cities 
		System.out.println("...............................");
		List<String> uniqueCities = students.stream()
			    .map(Student::getCity)
			    .distinct()
			    .toList();
		uniqueCities.forEach(c->System.out.println(c));
		
		//total cities count
		Long citiesCount = students.stream()
			    .map(Student::getCity)
			    .distinct()
			    .count();
		System.out.println("total cities :"+citiesCount);
		System.out.println("...............................");

		//highest marks of every student
		Optional<Integer> flatMap = students.stream()
			    .map(Student::getGrades)
//			    .peek(s->System.out.println("processing "+s))
			    .flatMap(s->s.stream())
//				.peek(s->System.out.println("processing "+s))
			    .distinct()
			    .max(Comparator.naturalOrder());
		System.out.println("highest marks "+flatMap.get());
		System.out.println("...............................");

		//avg marks of students
		Map<String, List<Student>> groupBy = students.stream()
				.collect(Collectors.groupingBy(student -> 
                student.getName() + " - " + student.getGrades()));
		
		groupBy.forEach((key, studentList) -> {
            System.out.println("Group: " + key);
        });
		
		System.out.println("...............................");
		//students and grading
		Map<String, List<Student>> groupedByName = students.stream()
		        .collect(Collectors.groupingBy(Student::getName));

		Map<String, List<Integer>> groupedByName2 = students.stream()
	 	     .collect(Collectors.toMap(Student::getName,Student::getGrades));
	  int sum = groupedByName2.entrySet().stream()
	 	   					  .mapToInt(entry->entry.getValue().stream().mapToInt(n->n).sum())
	 	   					  .sum();
	 	   	System.out.println("igugigiug "+sum);				  
	 	   					  
	 	   System.out.println("..............................."); 
	 	   Map<String, List<List<Integer>>> groupedByName3 = students.stream()
			 
 	     .collect(Collectors.groupingBy(Student::getName,Collectors.mapping(Student::getGrades,Collectors.toList())));
	    groupedByName.forEach((name, studentList) -> {
	        System.out.println("Name: " + name);
	        studentList.forEach(student -> 
	            System.out.println(" -> " + student.getGrades()));
	    });
	    
	    //students and his highest marks
	    System.out.println("...............................");
	    Map<String, Integer> highestMarksByStudent = students.stream()
	    	    .collect(Collectors.toMap(
	    	        Student::getName,
	    	        student -> student.getGrades().stream().max(Integer::compare).orElse(0)
	    	    ));
	    
	    highestMarksByStudent.forEach((s,m)->System.out.println(s+" his highest marks "+m));
	    
	    //avg marks of every student
	    System.out.println("...............................");
	    Map<String, Double> avgOfStudents = students.stream()
	    		.collect(Collectors.toMap(
	    				Student::getName, 
	    				student->student.getGrades()
	    								.stream()
	    								.mapToInt(Integer::intValue)
	    								.average()
	    								.orElse(0.0)
	    				));
	    avgOfStudents.forEach((name, average) -> 
	    System.out.println("Name: " + name + ", Average Grade: " + average));
	    
	    
	    //distinct grades
	    System.out.println("...............................");
	    List<Integer> distinctGrades = students.stream()
	    	    .flatMap(student -> student.getGrades().stream())
	    	    .distinct()
	    	    .toList();

	    	System.out.println("Distinct grades: " + distinctGrades);

	    //student and city
	    System.out.println("...............................");
	    Map<String, String> StudentAndCity = students.stream()
	    	    .collect(Collectors.toMap(Student::getName,Student::getCity));
	    
	    StudentAndCity.forEach((s,c)->System.out.println(s+" : "+c));
	    
	    System.out.println("...............................");
	    Map<String, Integer> collect = students.stream()
	    		.collect(Collectors.toMap(
	    					Student::getName,
	    					student->student.getGrades().stream()
	    												.collect(Collectors.summingInt(Integer::intValue))
	    				));
	    collect.forEach((s,m)->System.out.println(s+" : "+m));		
	    
		// student with lowest marks
		Optional<Entry<String, Integer>> min2 = collect.entrySet().stream()
												.min(Map.Entry.comparingByValue());
	
		// studnet with highest marks
		Optional<Entry<String, Integer>> max2 = collect.entrySet().stream()
												.max(Map.Entry.comparingByValue());

		System.out.println("Student with highest marks: " + max2.get().getKey() + " (" + max2.get().getValue() + ")");
		System.out.println("Student with lowest marks: " + min2.get().getKey() + " (" + min2.get().getValue() + ")");

	    		
		//highest and  lowest avg
		Optional<Entry<String, Double>> max3 = avgOfStudents.entrySet().stream()
											 .max(Map.Entry.comparingByValue());
		Optional<Entry<String, Double>> min3 = avgOfStudents.entrySet().stream()
											 .min(Map.Entry.comparingByValue());
		System.out.println("Student with highest average :"+max3.get().getKey()+" ("+max3.get().getValue()+")");
		System.out.println("Student with lowest average :"+min3.get().getKey()+" ("+min3.get().getValue()+")");
		
		
		
		//students with range of marks
		System.out.println("...............................");
		Map<String, List<String>> collect2 = students.stream()
				.collect(Collectors.groupingBy(
						 student -> {
					            int totalMarks = student.getGrades().stream().mapToInt(Integer::intValue).sum();
					            if (totalMarks >= 270) return "Excellent (270+)";
					            else if (totalMarks >= 240) return "Good (240-269)";
					            else if (totalMarks >= 210) return "Average (210-239)";
					            else return "Below Average (<210)";
					        },
						 Collectors.mapping(Student::getName,Collectors.toList())
						));
		
		collect2.forEach((range, names) -> 
	    System.out.println(range + ": " + names));
		
		
		//sorting students with age
		System.out.println("...............................");
		
		Map<Integer, String> collect3 = students.stream()
				.peek(student->System.out.println("processing student "+student.getName()+" : "+student.getAge()))
				.collect(Collectors.toMap(Student::getAge,Student::getName,
						(existing,newValue)->existing+","+newValue,
						 TreeMap::new //sorting
						));
		System.out.println(collect3);
		
	
		
				
	}
}
