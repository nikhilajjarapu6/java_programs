package arrays;

import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		int a[]= {12,40,42,60,20,33,11};
		int ele=12;
		int first=0;
		int last=a.length-1;	
		binarySearch(a,ele,first,last);
				

	}

	public static void binarySearch(int[] a, int ele, int first, int last) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(a[mid]<ele)
				first=mid+1;
			else if(a[mid]==ele) {
				System.out.println("element prested at :"+mid);break;
			}
			else
				last=mid-1;
			mid=(first+last)/2;
		}
		if(first>last)
			System.out.println("element is not found");
	}

	
}
