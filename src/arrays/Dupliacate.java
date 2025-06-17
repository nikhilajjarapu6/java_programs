package arrays;

public class Dupliacate {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,2,1,3,1,2,3,5,6};
		int b[]=new int[a.length];
		int visited=-1;
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[j]=visited;
					count++;}
			}
			if(b[i]!=visited)
				b[i]=count;
				
		}
		for(int i=0;i<a.length;i++) {
			if(b[i]!=visited && b[i]==2)
				System.out.println(a[i]+":"+b[i]);
		}

	}

}
