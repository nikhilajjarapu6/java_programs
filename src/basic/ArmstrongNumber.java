package basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		armstrong(153);

	}

	private static void armstrong(int n) {
		int temp=n;
		int sum=0;
		int count=0;
		while(n>0) {
			@SuppressWarnings("unused")
			int r=n%10;
			count++;
			n/=10;
		}
		n=temp;
//		System.out.println(n);
		while(n>0) {
			int r=n%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power=power*r;
			}
			sum+=power;
			n/=10;
		}
		if(sum==temp)
			System.out.println(true);
		else
			System.out.println(false);
		
	}

}
