package arrays;

public class NthGreatest {

    public static void main(String[] args) {
        int[] a = {70, 20, 30, 40, 50};
        int n = 1;
        
        // Sort the array in descending order
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Check if n is within valid range
        if (n > 0 && n <= a.length) {
            System.out.println("The " + n + "th greatest element is: " + a[n - 1]);
        } else {
            System.out.println("Invalid value of n.");
        }
    }

}
