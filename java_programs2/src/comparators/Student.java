package comparators;

public class Student {
	 	private String name;
	    private int marks;
	    private int age;

	    // Constructor
	    public Student(String name, int marks,int age) {
	        this.name = name;
	        this.marks = marks;
	        this.age=age;
	    }

	    public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

	    public String getName() {
	        return name;
	    }

	    public int getMarks() {
	        return marks;
	    }

	    @Override
	    public String toString() {
	        return name + " (" + marks + ")";
	    }

}
