package arrays;

public class NthMax {

	public static void main(String[] args) {
		int [] a= {3,9,5,4,8,7,6};
		int n=3;
		for(int i=0;i<a.length;i++) {
			int temp;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[n-1]);
		

	}

}
