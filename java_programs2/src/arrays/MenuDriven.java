package arrays;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		int[] a= {40,10,30,20,50};
		int[] b= {40,10,30,20,50,10,20,70,50,20};
		
		
		 boolean exit = false;

	        while (!exit) {
	            System.out.println("Choose an option:");
	            System.out.println("1. Reverse array");
	            System.out.println("2. Bubble sort");
	            System.out.println("3. Selection sort");
	            System.out.println("4. Max element");
	            System.out.println("5. Nth greatest element");
	            System.out.println("6. Maximum sum");
	            System.out.println("7. Occurrence of elements");
	            System.out.println("8. Duplicate elements");
	            System.out.println("9. Unique elements");
	            System.out.println("10. Right rotation");
	            System.out.println("11. Left rotation");
	            System.out.println("0. Exit");
	            
	            @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1: {
	                    System.out.println("Reverse array:");
	                    reverse(a);
	                    break;
	                }
	                case 2: {
	                    System.out.println("Bubble sort:");
	                    bubbleSort(a);
	                    break;
	                }
	                case 3: {
	                    System.out.println("Selection sort:");
	                    selectionSort(a);
	                    break;
	                }
	                case 4: {
	                    System.out.println("Max element:");
	                    max(a);
	                    break;
	                }
	                case 5: {
	                    System.out.println("Nth greatest element:");
	                    nthGreatest(a, 2);
	                    break;
	                }
	                case 6: {
	                    System.out.println("Maximum sum:");
	                    maxSum(a);
	                    break;
	                }
	                case 7: {
	                    System.out.println("Occurrence of elements:");
	                    occurance(b);
	                    break;
	                }
	                case 8: {
	                    System.out.println("Duplicate elements:");
	                    duplicate(b);
	                    break;
	                }
	                case 9: {
	                    System.out.println("Unique elements:");
	                    unique(b);
	                    break;
	                }
	                case 10: {
	                    System.out.println("Right rotation:");
	                    clockwise(a, 2);
	                    break;
	                }
	                case 11: {
	                    System.out.println("Left rotation:");
	                    antiClockwise(a, 2);
	                    break;
	                }
	                case 0: {
	                    exit = true;
	                    System.out.println("Exiting the program. Thank you!");
	                    break;
	                }
	                default: {
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    break;
	                }
	            }
	        }
	    

	}

	private static void antiClockwise(int[] a, int n) {
		for(int i=0;i<n;i++) {
			int first=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		for(int b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
	}

	private static void clockwise(int[] a,int n) {
		for(int i=0;i<n;i++) {
			int last=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
			
		}
		for(int b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
		
	}

	private static void nthGreatest(int[] a, int n) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(n+"th greatest element from the arra is "+a[a.length-n]);
		
	}

	private static void reverse(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}



	private static void unique(int[] b) {
		int[] temp=new int[b.length];
		int visited=-1;
		for(int i=0;i<b.length;i++) {
			int count=1;
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					count++;
					temp[j]=visited;
				}
			}
			if(temp[i]!=visited)
				temp[i]=count;
		}
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=visited && temp[i]==1)
				System.out.println("unique item from the array :"+b[i]);
		}
	}

	private static void duplicate(int[] b) {
		int temp[]=new int[b.length];
		int visited=-1;
		for(int i=0;i<b.length;i++) {
			int count=1;
			for(int j=i+1;j<temp.length;j++) {
				if(b[i]==b[j]) {
					temp[j]=visited;
					count++;
				}
			}
			if(temp[i]!=visited) {
				temp[i]=count;
			}
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=visited && temp[i]>1) {
				System.out.println(b[i]+"occrrued "+temp[i]+" times");
			}
		}
		
	}

	private static void occurance(int[] b) {
		int temp[]=new int[b.length];
		int visited=-1;
		for(int i=0;i<b.length;i++) {
			int count=1;
			for(int j=i+1;j<temp.length;j++) {
				if(b[i]==b[j]) {
					temp[j]=visited;
					count++;
				}
			}
			if(temp[i]!=visited)
				temp[i]=count;
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=visited && temp[i]==1 )
				System.out.println(b[i]+" occured "+temp[i]+" times");
		}
		
	}

	private static void maxSum(int[] a) {
		int maxSum=0;
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			int sum=0;
			while(n>0) {
				int r=n%10;
				sum+=r;
				n=n/10;
			}
			if(sum>maxSum)
				maxSum=sum;
		}
		System.out.println("maximum sum is : "+maxSum);
		
	}

	private static void max(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("maximumelement is "+max);
		
	}

	private static void selectionSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
		
	}

	private static void bubbleSort(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
		
	}

}
