package arrays;

public class Practice_2 {

	public static void main(String[] args) {
		int n=3;
		int count=1;
	
			for(int i=1;i<n/2;i++) {
				if(n%i==0) {
					count++;
				}
			}
		
		if(count==1) {
			System.out.println("yes");
		}
		else
			System.out.println("not");

	}

}
