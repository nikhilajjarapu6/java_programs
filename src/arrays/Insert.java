package arrays;

import java.util.Scanner;

public class Insert {
static Scanner r= new Scanner(System.in);
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Insert obj=new Insert();}

	public  void insert(int a[],int ele,int pos) {
		if(pos>a.length+1 || pos<=0)
			System.out.println("insertion is not possible");
		else {
			int res[]=new int[a.length+1];
			for(int i=0,j=0;i<res.length;i++) {
				if(i==pos-1)
					res[i]=ele;
				else
					res[i]=a[j++];}
			for(int b:res) {
				System.out.print("new array is:"+b+" ");}}
		
	}
}
