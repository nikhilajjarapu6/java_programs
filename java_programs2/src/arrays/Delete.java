package arrays;

public class Delete {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Delete del=new Delete();
		}
	public void delete(int[] a, int ele) {
		int ind=search(a,ele);
		if(ind==-1)
			System.out.println("deletion is not possible");
		else {
			int res[]=new int[a.length-1];
		for(int i=0,j=0;i<a.length;i++) {
			if(i!=ind)
				res[j++]=a[i];}
		for(int b:res) {
			System.out.print("new array after deletion is:"+b+" ");}}
	}
	public  int search(int[] a, int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				return i;}
		}
		return -1;
	}
}
