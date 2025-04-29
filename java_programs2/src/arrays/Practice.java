package arrays;

public class Practice {

	public static void main(String[] args) {
		int a[]= {1,4,2,6,18,39,45,7,13,97};
		for(int i=0;i<a.length;i++) {
			primeArray(a[i]);
		}
		
		
	}

	public static void primeArray(int n) {
		int count=1;
		for(int i=1;i<n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==1)
			System.out.println("prime");
		else
			System.out.println("not prime");
		
		
		
	}

}
