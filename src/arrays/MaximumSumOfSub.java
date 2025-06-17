package arrays;

public class MaximumSumOfSub {
	public static void main(String[] args) {
	 int[] array = {1, -3, 4, -2, -1, 6,8};

     int maxEndingHere = array[0];
     int maxSoFar = array[0];

     for (int i = 1; i < array.length; i++) {
         if (array[i] > maxEndingHere + array[i]) {
             maxEndingHere = array[i];
         } else {
             maxEndingHere = maxEndingHere + array[i];
         }
         
         if (maxEndingHere > maxSoFar) {
             maxSoFar = maxEndingHere;
         }
     }

     System.out.println("Maximum subarray sum is: " + maxSoFar);
	
	
}
}
