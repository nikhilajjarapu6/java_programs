package basic;

public class ConstructorEx  {
	int n;		//non static variable
	
public ConstructorEx(int n) {
	super();			
	this.n=n;
	System.out.println("constructer is excuted : "+n);
}



	public static void main(String[] args) {
		//constructor is a special method which is used to initialize non static properties and 
		//used along with new keyword to create new objects 
		
		ConstructorEx  ex=new ConstructorEx(5);	//argument constructor
		System.out.println(ex);
		

	}

}
