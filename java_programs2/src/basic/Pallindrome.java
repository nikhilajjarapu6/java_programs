package basic;

public class Pallindrome {

	public static void main(String[] args) {
		int n=999;
		int reverse=0;
		int temp=n;
		while(n>0) {
			int r=n%10;
			reverse=(reverse*10)+r;
			n=n/10;
		}
		if(temp==reverse)
			System.out.println("it is pallindrome");
		else
			System.out.println("not pallindrome");

	}

}
