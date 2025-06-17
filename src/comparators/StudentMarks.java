package comparators;

import java.util.Comparator;

public class StudentMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int marksSort=Integer.compare(o1.getMarks(),o2.getMarks());
		return marksSort;
	}

}
