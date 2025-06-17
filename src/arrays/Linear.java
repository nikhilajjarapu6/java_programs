package arrays;

public class Linear {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		int n=7;
		System.out.println(linearSearch(a,n));
		
	

	}

	public static int linearSearch(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			if(a[i]==n)
				return i;
			
		}
		return -1;
		
	}

}
