package basic;

public class Swap {
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}

	private static void method3() {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
	}

	private static void method2() {
		int a=10;
		int b=20;
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(a+" "+b);
	}

	private static void method1() {
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
	}
	;

	
}
