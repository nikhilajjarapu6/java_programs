package arrays;

public class MaxOfUnsorted {

	public static void main(String[] args) {
		int[]a= {2,5,8,4,9,3};
		
		int n=2;
		@SuppressWarnings("unused")
		int b[]=new int[a.length];
		int max=0;
		for(int i=0;i<n;i++) {
			max=i;
			for(int j=i+1;j<a.length;j++) {
				if(max<a[j]) {
					max=j;
				}
			
			a[i]=Integer.MAX_VALUE;
			a[j]=Integer.MAX_VALUE;
			
		}}
		System.out.println(max);
	}

}
