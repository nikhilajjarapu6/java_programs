package arrays;

public class MinSum {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,99,1289};
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			int n=a[i];
			while(n>0){
				int r=n%10;
				sum+=r;
				n/=10;
//				min=sum;
			}
			if(sum<min)
				min=sum;
		}
		System.out.println("Minimum sum of elements :"+min);
	
}
}
