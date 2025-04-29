package arrays;

public class MaxSum {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,99,1289};
		int maxsum=0;
	
		for(int i=0;i<a.length;i++) {
			int sum=0;
			int n=a[i];
			while(n>0) {
				int r=n%10;
				sum=sum+r;
				n=n/10;
			}
			if(sum>maxsum)
				maxsum=sum;
		}
		System.out.println(maxsum);

	}

}
