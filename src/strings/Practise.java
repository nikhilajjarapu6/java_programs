package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		String str="hello world java";
		System.out.println("reverse String");
		reverseString(str);
		System.out.println("*************************");
		System.out.println("palindrome ");
		palindrome(str);
		System.out.println("*************************");
		System.out.println("occurance of a string");
		occurance(str);
		System.out.println("*************************");
		System.out.println("occurance of a particular charecter");
		charecterOccurance(str,r);
		System.out.println("*************************");
		System.out.println("checking two strings anagram or not");
		anagram(r);
		System.out.println("*************************");
		System.out.println("longest prefix in string array");
		lonegstPrefix();
		
	}

	private static void lonegstPrefix() {
		String[] str= {"flower","flow","floating","flows"};
		String prefix="";
		
	}

	private static void anagram(Scanner r) {
	   
	        System.out.println("enter first string");
	        String str = r.next();  // Read the first string
	        System.out.println("enter second string");
	        String str1 = r.next(); // Read the second string
	        
	        str = str.replaceAll("\\s", "");
	        str1 = str1.replaceAll("\\s", "");
	        
	        boolean isAnagram = true;
	        
	        if (str.length() != str1.length()) {
	            isAnagram = false;
	        } else {
	            char[] ch = str.toLowerCase().toCharArray();
	            char[] ch1 = str1.toLowerCase().toCharArray();
	            
	            Arrays.sort(ch1);
	            Arrays.sort(ch);
	            
	            if (!Arrays.equals(ch1, ch)) {
	                isAnagram = false;
	            }
	        }
	        
	        if (isAnagram) {
	            System.out.println("Yes, both Strings are anagrams");
	        } else {
	            System.out.println("No, they are not anagrams");
	        }
	    }



	private static void charecterOccurance(String str, Scanner r) {
		
			System.out.println("enter charecter you want find occurance");
			char ch=r.next().charAt(0);
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i))
					count++;
			}
			System.out.println("occurance of "+ch+" is :"+count);
		}
	

	private static void occurance(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str1.indexOf(str.charAt(i))==-1) {
				str1=str1+str.charAt(i);
			}
		}
		for(int i=0;i<str1.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(str1.charAt(i)==str.charAt(j))
					count++;
			}
			if(count>0)
				System.out.println("occurance of charecter "+str1.charAt(i)+":"+count);
			
		}
	}

	private static void palindrome(String str) {
	    String result = "";
	    str="memem";
	    str = str.toLowerCase();
	    for (int i = 0; i < str.length(); i++) {
	        result = str.charAt(i) + result;
	    }
//		if(str.equals(result))
//			System.out.println("yess palindrome");
//		else
//			System.out.println("not pallindrome");

	    int left = 0, right = str.length() - 1;
	    boolean isPalindrome = true; 
	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            isPalindrome = false;
	            break; 
	        }
	        left++;
	        right--; 
	    }

	    if (isPalindrome) {
	        System.out.println("Yes, palindrome");
	    } else {
	        System.out.println("No, not palindrome");
	    }
	}


	private static void reverseString(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			 str1=str.charAt(i)+str1;
		}
		System.out.println(str1);
		
	}

}
