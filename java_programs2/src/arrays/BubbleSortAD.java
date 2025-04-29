package arrays;

public class BubbleSortAD {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,10,30,40,20,60,70};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("asccending order");
		for(int b:a) {
			System.out.print(b+" ");
		}
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("desc order");
		for(int b:a) {
			System.out.print(b+" ");
		}
		
	}
}
