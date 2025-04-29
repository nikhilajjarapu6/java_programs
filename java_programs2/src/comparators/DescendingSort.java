package comparators;

import java.util.Comparator;

public class DescendingSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int descendingSort=Integer.compare(o2.getMarks(),o1.getMarks());
		return descendingSort;
	}

}
