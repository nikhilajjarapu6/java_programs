package arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int element=30;
		binarySearch(a,element);
	}

	private static void binarySearch(int[] a, int element) {
		int first=0;
		int last=a.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(a[mid]==element) {
				System.out.println("elelmt presented at :"+mid);
				return;
			}
			else if(a[mid]>element)
				last--;
			else
				first++;
		}
		System.out.println("Element is not peseneted");
		
	}
	
}
