package arrays;

import java.util.Scanner;

public class SearchDriven {
	static Scanner r=new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean run=false;
		while(!run) {
			System.out.println("enter you Searching Techinque");
			System.out.println("1.Binary Search");
			System.out.println("2.linear Search");
			System.out.println("3.exit");
			int choice=r.nextInt();
			
			switch(choice) {
			case 1:{
				binarySearch();
				break;
			}
			case 2:{
				linearSearch();
				break;
			}
			case 3:{
				run=true;
				System.out.println("Exiting the program. Thank you!");
				break;
			}
			default :{
				
			}
		
			}
				
		}
	}

	private static void linearSearch() {
		System.out.println("enter array length");
		int length=r.nextInt();
		System.out.println("enter array elements");
		int[]a=new int[length];
		for(int i=0;i<length;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("your array");
		for(int b:a) {
			System.out.print(b+" ");
		}
		System.out.println("\nenter number you want to search");
		int n=r.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println("element presentd at:"+i);
				return;
			}
		}
		System.out.println("element is not presented");
		
	}

	private static void binarySearch() {
		System.out.println("enter array length");
		int length=r.nextInt();
		System.out.println("enter array elements");
		int[]a=new int[length];
		for(int i=0;i<length;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("your array");
		for(int b:a) {
			System.out.print(b+" ");
		}
		System.out.println("\nenter number you want to search");
		int n=r.nextInt();
		
		int first=0;
		int last=a.length-1;
		
		while(first<=last) {
			int mid=(first+last)/2;
			if(a[mid]==n) {
				System.out.println("element presented at:"+mid);
				return;
			}
			else if(a[mid]>n) {
				last--;
			}
			else
				first++;
		}
		System.out.println("element not presnetd");
		
	}

}
