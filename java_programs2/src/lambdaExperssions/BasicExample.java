package lambdaExperssions;


interface A{
	void add(int a,int b);
	
	//default method in interface 
	default void add1(int a,int b) {
		System.out.println(a+b);
	}
}


public class BasicExample{
	public static void main(String[] args) {
//		int a=10,b=20;
		
		//implementation for add method in interface a
		A obj=(int a,int b)->System.out.println(a+b);
		
		//passing arguments for add method
		obj.add(10, 20);
		obj.add1(1, 2);
	}

	//instead of providing implementation separate
	//whole code can be passed as argument in lambda
//	@Override
//	public void add(int a,int b) {
//		System.out.println(a+b);
//	}

}




