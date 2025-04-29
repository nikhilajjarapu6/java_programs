package arrays;

public class Update {

	public static void main(String[] args) {	}
	public  void update(int[] a, int up, int pos) {
		if(pos>a.length ||pos<0)
			System.out.println("upadation is not possible");
		else
			for(int i=0;i<a.length;i++) {
				if(i==pos-1)
					a[i]=up;}
		for(int b:a) {
			System.out.print("updated arrays is:"+b+" ");}
		}
}
