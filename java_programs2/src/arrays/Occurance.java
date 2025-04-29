package arrays;

public class Occurance {
	public static void main(String[] args) {
		int []a= {10,10,20,50,30,50,20,40,60,10};
		int []b=new int[a.length];
		int visited=-1;
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited) {
				b[i]=count;
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=visited) {
				System.out.println(a[i]+":"+b[i]);
			}
		}
		
	}
}
