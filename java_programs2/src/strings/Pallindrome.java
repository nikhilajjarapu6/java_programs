package strings;

public class Pallindrome {
	public static void main(String[] args) {
		String str="zzzzz";
		System.out.println(withoutEquals(str));
		
	}
	public static boolean withoutEquals(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			str1=str.charAt(i)+str1;
		}
		if(str1.equals(str))
			return true;
		else
			return false;
	}

}
