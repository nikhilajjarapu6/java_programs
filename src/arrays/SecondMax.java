package arrays;

public class SecondMax  {
	public static void main(String[] args) {
		Integer[] a= {1,4,2,5,3};
		
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
				
			}
			else if(a[i]!=max && a[i]>secondMax) {
				secondMax=a[i];
			}
		}
		System.out.println("maximum number "+max);
		System.out.println("second maximum number "+secondMax);
		
		int nthmax=1;
		
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
		for(int num:a) {
			System.out.print(num);
		}
		System.out.println();
		System.out.println(nthmax+"th max is "+a[a.length-nthmax]);
	}
}
