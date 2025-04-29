package comparators;

import java.util.Comparator;

public class DualComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int marksSort=Integer.compare(o1.getMarks(),o2.getMarks());
		if(marksSort==0) {
			return o1.getName().compareTo(o2.getName());
		}
		return 0;
	}
	
}
