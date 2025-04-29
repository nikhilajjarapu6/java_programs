package collections;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int rank;
	int marks;
	public Student(int id, String name, int rank, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.rank=rank;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if(marks<o.marks)
			return 1;
		else if(marks==o.marks) 
			return 0;
		else
			return -1;
//		return name.compareTo(o.name);  sorting by name
	}
	
//	 @Override
//	    public int compareTo(Student o) {
//	        return this.name.compareTo(o.name); // Compare by name
//	  }
	
//	@Override
//	public String toString() {
//	    return id + " " + name + " " + rank + " " + marks;
//	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	 public static Comparator<Student> nameComparator() {
	        return new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                return s1.name.compareTo(s2.name);
	            }
	        };
	    }

	    public static Comparator<Student> marksComparator() {
	        return new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                return Integer.compare(s2.marks, s1.marks); // Descending order
	            }
	        };
	    }
	
	
	
}
