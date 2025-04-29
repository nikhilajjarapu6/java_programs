package arrays;

public class SelectionSort {
	public static void main(String[] args) {
		 int[] a = {70, 20, 30, 40, 90};
		 
		 for(int i=0;i<a.length;i++) {
			 int min=i;
			 for(int j=i+1;j<a.length;j++) {
				 if(a[min]>a[j])
					 min=j;
			 }
			 int temp=a[min];
			 a[min]=a[i];
			 a[i]=temp;
		 }
		 for(int b :a) {
			 System.out.print(b+" ");
		 }
	}

}
