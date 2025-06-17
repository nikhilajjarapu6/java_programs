package arrays;

public class LineraSearch {
 public static void main(String[] args) {
	int []a= {10,40,20,50,30};
	int n=20;
	linearSearch(a,n);
	
}

private static void linearSearch(int[] a, int n) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			System.out.println("element presented at "+i);
			return;
		}
	}
	System.out.println("ellement is not preseted");
	
}
}
