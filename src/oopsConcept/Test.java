package oopsConcept;

public class Test{
	public static void main(String[] args) {
		//calling static methods and storing in variable
		Singleton singleton=Singleton.getInstance();
		singleton.show();  //accessing of non static members through singleton instance
		
	}
}

class Singleton {
	//static final variable for storing instance
	private static Singleton instance;
	private Singleton() {
		System.out.println("example for singleton");
	}
	
	//static method for return instance
	public static Singleton getInstance() {
		if(instance==null) {
			return new Singleton();
		}
		return instance;
	}
	
	//non static methods
	public void show() {
		System.out.println("from single ton class");
	}	
	
}


