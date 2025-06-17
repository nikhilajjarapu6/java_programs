package arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a= {1,4,7,2,8,9,1,5,3,4,9,8,8,5,0};
		int b[]=new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]= visited;}
			}
			if(b[i]!=visited)
				b[i]=count;
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=visited && b[i]==1)
				System.out.println(a[i]+":"+b[i]);
		}
	}

}
