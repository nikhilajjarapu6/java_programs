package oopsConcept;

public class Child extends Parent {
	
	String cName;
	int cAge;
	static int number=20;
	
	public Child(int id, int age, String name, String cName, int cAge) {
		super(id, age, name);
		this.cName = cName;
		this.cAge = cAge;
	}
	
	public static void display() {
		System.out.println("Static Method From Child class");
		System.out.println(number);
	}
	public void walk() {
		System.out.println("non static method from child class");
		System.out.println(this.cName+" age is "+age);
	}
	public void run() {
		System.out.println("child running");
	}

	

	

}
