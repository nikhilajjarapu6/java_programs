package streamAPI;

public class Fibonacci {
	public static void main(String[] args) {
		int n=10;
		int first=0,second=1;
		System.out.println(first+"\n"+second);
		for(int i=2;i<n;i++) {
			int res=first+second;
			first=second;
			second=res;
			System.out.println(res);
		}
		
		
		
	}
}
