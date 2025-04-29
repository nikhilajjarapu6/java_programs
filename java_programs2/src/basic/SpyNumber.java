package basic;

public class SpyNumber {

	public static void main(String[] args) {
		int n=123;
		spyNumber(n);

	}

	private static void spyNumber(int n) {
		int sum=0;
		int temp=n;
		int product=1;
		while(temp>0) {
			int r=temp%10;
			product=product*r;
			sum=sum+r;
			temp/=10;
		}
		if(product==sum)
			System.out.println(true);
		else
			System.out.println(false);
			
	}

}
