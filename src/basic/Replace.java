package basic;

public class Replace {
	public static void main(String[] args) {
		int result=replaceZero(1080507);
		System.out.println(replace(10000));
		System.out.println(result);
	}

	private static int replaceZero(int n) {
		 int result = 0;
	      int multiplier = 1;
//		int temp=n;
		while(n>0) {
			int r=n%10;
			if(r==0)
				r=5;
			
			result=result+(r*multiplier);
			multiplier=multiplier*10;
			n/=10;
		}
		return result;
		
	}
	
	private static int replace(int n) {
		String number=Integer.toString(n);
		number=number.replace("0", "5");
		int num=Integer.parseInt(number);
		return num;
	}
	
	
	
}
