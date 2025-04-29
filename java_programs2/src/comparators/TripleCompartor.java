package comparators;

import java.util.Comparator;

public class TripleCompartor implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int marksSort=Integer.compare(o1.getMarks(),o2.getMarks());
		if(marksSort==0) {
			int nameSort=o1.getName().compareTo(o2.getName());
			if(nameSort==0) {
				int ageSort=Integer.compare(o1.getAge(),o2.getAge());
				return ageSort;
			}
			return nameSort;
		}
		return marksSort;
	}
	
}
