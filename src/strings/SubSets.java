package strings;

public class SubSets {
	public static void main(String[] args) {
		String str="fun";
		String[] arr=new String[str.length()*(str.length()+1)/2];
		int temp=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				arr[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
