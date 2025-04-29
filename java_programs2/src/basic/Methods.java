package basic;

public class Methods {
	static int a=30;		
	
	public static void main(String[] args) {
		int a=10;  //local variables  no default values
												//int a=30; we cannot redeclare local variable
		
		System.out.println(a); 				 	//10  first it will check on stack area(local variables)
		System.out.println(Methods.a);		 	//static members are accessed by the class name
		Methods.walk();                    		//method calling statement
		System.out.println("method executed");
	}
	
	public static void walk() {				//method called statement
		System.out.println("executing from static method");
		Methods.play();
		System.out.println(Methods.a);
		System.out.println(a);	
		
	}
	
	public static void play() {
		System.out.println("palying");
		//Methods.walk();  example for stack over flow error
	}
	
	

}
