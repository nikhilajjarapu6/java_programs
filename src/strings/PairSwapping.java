package strings;

public class PairSwapping {
	public static void main(String[] args) {
		String str="hello world java";
		swap(str);
	}

	private static void swap(String str) {
		char[] charecters=str.toCharArray();
		for(int i=0;i<charecters.length-1;i+=2) {  //here we swaping pairs so we need increment +2
			char temp=charecters[i];
			charecters[i]=charecters[i+1];
			charecters[i+1]=temp;
		}
		System.out.println(new String(charecters));   //converting char array to string
	}

}
