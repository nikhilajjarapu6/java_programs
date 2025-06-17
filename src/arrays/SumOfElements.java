package arrays;

public class SumOfElements {

	public static void main(String[] args) {
        int[]a= {10,20,30,40,51};
        int sum=0;
		
		for(int i=a.length-1;i>=0;i--) {
			sum+=a[i];

		}
		System.out.println(sum);

	}

}
