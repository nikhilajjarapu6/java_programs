package basic;

public class Armstrong2 {
	public static void main(String[] args) {
//      primeNumber(145);
    	System.out.println(isArmstrong(153));
    }
	private static boolean isArmstrong(int n) {
		int temp=n;
		int sum=0;
		int noOf=factorial(n);
		System.out.println(noOf);
		while(temp>0) {
			int r=temp%10;
			int power=1;
			for(int i=0;i<noOf;i++) {
				power=power*r;
			}
			sum+=power;
			temp/=10;
		}
		System.out.println(n);
		System.out.println(sum);
		return sum==n;
	}
	
	public static int factorial(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}

}
