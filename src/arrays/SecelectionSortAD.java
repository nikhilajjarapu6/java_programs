package arrays;

public class SecelectionSortAD {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,10,30,40,20,60,70};
		for(int i=0;i<a.length-1;i++) {
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
		System.out.println("asec order");
		for(int b:a) {
			System.out.print(b+" ");
		}
		
		int ar[]= {10,20,30,40,50,10,30,40,20,60,70};
		for(int i=0;i<a.length-1;i++) {
			int max=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[max]<ar[j]) {
					max=j;
				}
			}
			int temp=ar[max];
			ar[max]=ar[i];
			ar[i]=temp;
		}
		System.out.println();
		System.out.println("desc order");
		for(int b:ar) {
			System.out.print(b+" ");
		}
		
	}
}
