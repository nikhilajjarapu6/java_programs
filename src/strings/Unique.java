package strings;

public class Unique {

	public static void main(String[] args) {
		String str="hello world java";
		unique(str);
	}
	private static void unique(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str1.indexOf(str.charAt(i))!=1) {
				str1=str1+str.charAt(i);
			}
		}
	
		for(int i=0;i<str1.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str1.charAt(i)==str.charAt(j))
					count++;
				
							}
			if(count==1) {
				System.out.println(str1.charAt(i)+":"+count);
			}

		}
		
	}
}
