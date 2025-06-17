package comparators;

import java.util.Comparator;

public class StudentNames implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		int nameSort=o1.getName().compareTo(o2.getName());
		return nameSort;
	}
}