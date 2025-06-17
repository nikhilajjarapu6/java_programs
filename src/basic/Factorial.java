package basic;

public class Factorial {

	public static void main(String[] args) {
	fact(5);

}

	private static void fact(int n) {
		int fact=1;		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
}