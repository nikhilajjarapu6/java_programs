package basic;

public class Student {
	private String name;
	private int age;
	private int roll;
	public Student(String name, int age, int roll) {
		super();
		this.name = name;
		this.age = age;
		this.roll = roll;
	}
	
	public void setName(String newName) {
		this.name=newName;			//to reinitialize current object name with new name
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public String getName() {
		return this.name;			//t return current object name
	}
	public int getAge() {
		return age;
	}
	public int getRoll() {
		return roll;
	}
	

}
