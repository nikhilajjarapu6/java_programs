package practice;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] array = {10,20,10,30,20};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    break; // Break to avoid counting the same duplicate multiple times
                }
            }
        }

        System.out.println("Number of duplicates in the array: " + count);
		
	}

}
