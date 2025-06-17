package arrays;

public class PrimeNumber {

	public static void main(String[] args) {
	
				int n=10;
				int count=1;
				for(int i=1;i<n/2;i++) {
					if(n%i==0)
						count++;
				}
				if(count==2)
					System.out.println("prime");
				else
					System.out.println("not prime");
						

			}
	

		

}
