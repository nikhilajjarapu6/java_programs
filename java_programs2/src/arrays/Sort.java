package arrays;

public class Sort {

	public static void main(String[] args) {

	}
	public void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			}
		for(int b:a) {
			System.out.print("sorted array is:"+b+" ");
		}
		
	}

}
