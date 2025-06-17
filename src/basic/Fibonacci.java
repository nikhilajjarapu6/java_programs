package basic;

public class Fibonacci {

	public static void main(String[] args) {
		 int n = 10; // Number of Fibonacci numbers to generate

	       
	        // Print the Fibonacci series
            System.out.println("Fibonacci Series:");
            int n1 = 0;
            int n2 = 1;
//            for (int i = 0; i < n; i++) {
//                System.out.print(n1 + " ");
//                int nextNumber = n1 + n2;
//                n1 = n2;
//                n2 = nextNumber; }

//	        int n1=0,n2=1,n3,i,count=10;    
//	        System.out.print(n1+" "+n2);//printing 0 and 1   
            int count=n;  
	        for(int i=0;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	        {    
	        int n3=n1+n2;    
	         System.out.print(n1+" ");    
	         n1=n2;    
	         n2=n3;    
	        }    
	                    
	}

}
