package collections;

import java.util.Comparator;

public class RankComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.rank==o2.rank)
			return 0;
		else if(o1.rank > o2.rank)
			return 1;
		else
			return -1;
			
	}
	
}
