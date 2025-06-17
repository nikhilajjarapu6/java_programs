package oopsConcept;

public class Parent{
	int id;
	int age;
	String name;
	static int number=10;
	public Parent(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	//loaded during class loading process
	//only static members can be accessed
	//no this  keyword also
//	static {
//		System.out.println("staic initializer block");
//		System.out.println("we can access static here"+number);
//	}
//	
//	//IIB will be loaded before constructor loaded
//	//reason why loaded with default values
//	//directly or with this key word we can access non static members
//	//directly we can access static
//	{
//		System.out.println("non static initializer block");
//		System.out.println("we can access static here"+number);
//		System.out.println("alos non static"+id);
//		System.out.println("or else we can use this keyword"+this.name);
//	}
	
	public static void display() {
		System.out.println("Static Method From Parent class");
		System.out.println(number);
	}
	
	public void walk() {
		System.out.println("non static method from parent class");
		System.out.println(this.name+" is walking");
	}
}
