package basic;

public class StrongNumber {

	public static void main(String[] args) {
		strongNumber(145);

	}

	private static void strongNumber(int n) {
		int temp=n;
		int sum=0;
	    while(n>0) {
	    	int fact=1;
	    	int r=n%10;
	    	for(int i=1;i<=r;i++) {
	    		fact=fact*i;
	    		
	    	}
	    	sum+=fact;
	    	n/=10;
	    	
	    }
	  
	    System.out.println(sum);
	    if(temp==sum)
	    	System.out.println(true);
	    else
	    	System.out.println(false);
	}

}
