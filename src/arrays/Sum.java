package arrays;

public class Sum {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7};
		int sum=0;
		
		int n=3;
		for(int i=0;i<3;i++) {
			int max=i;
			int temp=i;
			for(int j=i+1;j<a.length;j++) {
				if(max<a[j]) {
					temp=max;
					max=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
