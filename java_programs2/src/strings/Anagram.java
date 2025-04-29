package strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "barg";
        String str1 = "Grab";
        boolean res;

        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        str1 = str1.replaceAll("\\s", "").toLowerCase();

        // Sort the strings
        char[] strArray = str.toCharArray();
        char[] str1Array = str1.toCharArray();
        Arrays.sort(strArray);
        Arrays.sort(str1Array);

        // Check if the sorted strings are equal
        res = Arrays.equals(strArray, str1Array);

        if (res) {
            System.out.println("Yes, anagram");
        } else {
            System.out.println("No");
        }
    }
}
