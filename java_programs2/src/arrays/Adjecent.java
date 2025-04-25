package arrays;

public class Adjecent {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,1,2,2,1,3,1,2,3,2,5,6,0};
		for(int i=0;i<a.length-1;i++) {
			if((a[i]+a[i+1])%2!=0 && (a[i]+a[i+1])/2==1) {
				System.out.println(a[i]+""+a[i+1]);
				i++;
			
			}
		}

	}

}
