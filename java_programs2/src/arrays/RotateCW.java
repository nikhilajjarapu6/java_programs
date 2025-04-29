package arrays;

public class RotateCW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5};
		int n=101;
			for(int i=0;i<n;i++) {
				int temp=a[0];
				int j;
				for( j=0;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				a[a.length-1]=temp;
			}
		
			
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
		

	}

}
