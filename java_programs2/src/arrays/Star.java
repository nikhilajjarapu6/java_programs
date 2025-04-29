package arrays;

import java.util.Scanner;

public class Star {
	static Scanner r=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		boolean run=true;
		while(run) {
			System.out.println("Select pattern");
			System.out.println("1.Pattern 1");
			System.out.println("2.Pattern 2");
			System.out.println("3.Pattern 3");
			System.out.println("4.Pattern 4");
			System.out.println("5.Pattern 5");
			System.out.println("6.Pattern 6");
			System.out.println("7.Pattern 7");
			System.out.println("8.Pattern 8");
			System.out.println("9.Pattern 9");
			System.out.println("10.Pattern 10");
			System.out.println("11.Pattern 11");
			System.out.println("12.Pattern 12");
			System.out.println("13.Pattern 13");
			System.out.println("14.Pattern 14");
			System.out.println("15.Pattern 15");
			System.out.println("0.Exit");
			int choice=r.nextInt();
			
			switch(choice) {
			case 1:{
				patternOne();
				break;
			}
			
			case 2:{
				patternOne();
				break;
			}
			case 3:{
				patternOne();
				break;
			}
			case 4:{
				patternOne();
				break;
			}
			case 5:{
				patternOne();
				break;
			}
			case 6:{
				patternOne();
				break;
			}
			case 7:{
				patternOne();
				break;
			}
			case 8:{
				patternOne();
				break;
			}
			case 9:{
				patternNine();
				break;
			}
			case 10:{
				pattern10();
				break;
			}
			case 11:{
				pattern11();
				break;
			}
			case 12:{
				pattern10();
				break;
			}
			case 13:{
				pattern10();
				break;
			}
			case 0:{
				run=false;
				System.out.println("thank you see u again");
				break;
			}
			
			
			}
		}
		
	
	}
	
	 private static void patternOne(){
	    	for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}	
	}
	 
	 @SuppressWarnings("unused")
	private static void patternTwo(){
		 for(int i=1;i<=5;i++) {
				for(int j=i;j<=5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}	
	}
	
	 private static void patternThree(){
		 for(int i=1;i<=10;i++) {
			 if(i<5) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			 }
			 else {
				 for(int j=i;j<=10;j++) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }		
		}
//		 for (int i = 1; i <= 9; i++) {
//	            int numStars = (i <= 5) ? i : 10 - i;
//	            for (int j = 1; j <= numStars; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }	
	}
	private static void patternFour(){
		int space=5;
		int star=0;
		
		for(int i=1;i<=5;i++) {
			space--;
			star++;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void patternFive(){
		int space=-1;
		int star=6;
		
		for(int i=1;i<=5;i++) {
			space++;
			star--;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");	
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void patternSix(){
		int space=-1;
		int star=6;
		
		for(int i=1;i<10;i++) {
			if(i<=5) {
				space++;
				star--;
			}
			else {
				space--;
				star++;
			}
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");	
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void patternSeven(){
		int space=5;
		int star=0;
		
		for(int i=1;i<10;i++) {
			if(i<=5) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");	
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void patternEight(){
		 int space = 10;
	        int star = 0;
	        for (int i = 0; i <= 10; i++) {
	            if (i <5) {
	                space -= 2;
	                star++;
	            } else {
	                space += 2;
	                star--;
	            }

	            for (int j = 1; j <= star; j++) {
	                System.out.print("*");
	            }
	            for (int j = 1; j <= space; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= star; j++) { 
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	}
	private static void patternNine(){
		 int space = -1;
	        int star = 12;
	        for (int i = 1; i <10; i++) {
	            if (i <=5) {
	                space++;
	                star-=2;
	            } else {
	                space--;
	                star+=2;
	            }
	            for (int j = 1; j <= space; j++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= star; j++) {
	                System.out.print("*");
	            }
	           
	           
	            System.out.println("");
	        }
	}
	private static void pattern10(){
		int n=5;
    	for (int i = 0; i < n; i++) {
    		for (int j = 1; j <=n-i; j++) { 
    		System.out.print(" "); 
    		}
    		for (int j = 0; j <= i; j++) {
    		System.out.print("* "); 
    		}

    		System.out.println(); 

    		}
	}
	
	private static void pattern11(){
		int n=3;
    	for (int i = 0; i < n; i++) {
    		for (int j = 1; j <=n-i; j++) { 
    		System.out.print(" "); 
    		}
    		for (int j = 0; j <= i; j++) {
    		System.out.print("* "); 
    		}

    		System.out.println(); 

    		}
    	for(int i=1;i<=3;i++) {
    		for(int j=1;j<=i+1;j++) {
    			System.out.print(" ");
    		}
    		for (int j = 2; j >= i; j--) {
        		System.out.print("* "); 
        	}
    		System.out.println(); 
    	}
         
	}
	private static void pattern12(){
		for(int i=1;i<=5;i++) {
    		for(int j=1;j<=5;j++) {
    			if(i==j) {
    				System.out.print("*");
    			}
    			else if(i+j==6 ) {
    				System.out.print("*");
    			}
    			else{
    				System.out.print(" ");
    			}
    			
    		}
    		System.out.println();
    	}
	}
	private static void pattern13(){
		for(int i=1;i<=5;i++) {
    		for(int j=1;j<=5;j++) {
    			if(i==j) {
    				System.out.print("*");
    			}
    			else if(i+j==6 ) {
    				System.out.print("*");
    			}
    			else{
    				System.out.print(" ");
    			}
    			
    		}
    		System.out.println();
    	}
	}
	private static void pattern14(){
		for(int i=1;i<=5;i++) {
    		for(int j=1;j<=5;j++) {
    			if(i==j) {
    				System.out.print("*");
    			}
    			else if(i+j==6 ) {
    				System.out.print("*");
    			}
    			else{
    				System.out.print(" ");
    			}
    			
    		}
    		System.out.println();
    	}
	}


	private static void pattern20() {
		int space=3;
		int star=0;
		for(int i=1;i<=7;i++) {
			if(i<=3) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
	
   

}
