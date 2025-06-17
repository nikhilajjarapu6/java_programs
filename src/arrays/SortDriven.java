package arrays;

import java.util.Scanner;

public class SortDriven {
	static Scanner r=new Scanner(System.in);
	public static void main(String[] args) {
		boolean run=true;
		while(run) {
		System.out.println("enter Your Sorting techinque");
		System.out.println("1.Bubble Ascending Sort");
		System.out.println("2.Bubble Descending Sort");
		System.out.println("3.Selection Ascending Sort");
		System.out.println("4.Selection Decending Sort");
		System.out.println("5.Exit");
		int choice=r.nextInt();
		
		
	
		switch(choice) {
		case 1:{
			bubbleSortAO();
			break;
		}
		case 2:{
			bubbleSortDO();
			break;
		}
		case 3:{
			selectionSortAO();
			break;
		}
		case 4:{
			selectionSortDO();
			break;
		}
		case 5:{
			run=false;
			System.out.println("Exiting the program. Thank you!");
			break;
		}
		
	  }
	}
  }
	private static void bubbleSortAO() {
		int[]a= insertArray();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		printArray(a);
	}
	private static void bubbleSortDO() {
		int[]a= insertArray();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		printArray(a);
		
	}
	private static void selectionSortAO() {
		int[]a= insertArray();
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		printArray(a);
		
	}
	private static void selectionSortDO() {
		int[]a= insertArray();
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]<a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		printArray(a);
		
	}
	
	public static int[] insertArray() {
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
		
		return a;
	}
	public static void printArray(int []a) {
		System.out.println("\nyour sorted array");
		for(int b:a) {
			System.out.print(b+" ");
		}
        System.out.println();
	}
}
