package basic;

public class PerfectNumber {

	public static void main(String[] args) {
		 int n = 28; // Change this to the number you want to check
	        perfectNumber(n);

	}
	private static void perfectNumber(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
