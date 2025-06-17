package strings;

public class CapitalWord {
	public static void main(String[] args) {
		String str="hello java world whatever you type first letter will be converted into upperecase";
		methodOne(str);
		methodTwo(str); //using string builder
		methodThree(str);      	
	}

	private static void methodThree(String str) {
		String[] words=str.split(" ");
		String result="";
		for(String word:words) {
			String capital=capitalizedWord(word);
			result=result+capital+" ";
		}
		System.out.println(result);
		
	}

	private static String capitalizedWord(String word) {
		String capitalized=word.substring(0,1).toUpperCase()+word.substring(1);
		return capitalized;
		
	}

	private static void methodTwo(String str) {
		String[] words=str.split(" ");
		StringBuilder result=new StringBuilder();
		int count=0;
		  for (String word : words) {
	            if (!word.isEmpty()) { // Check if the word is not empty
	                char firstChar = Character.toUpperCase(word.charAt(0));
	                String restOfWord = word.substring(1);
	                result.append(firstChar).append(restOfWord).append(" ");
	            } else {
	                result.append(" "); 
	            }
	            count=count+word.length();
	        }

	        String capitalizedSentence = result.toString().trim(); 
	        System.out.println(capitalizedSentence);
	        System.out.println(count);
	    }
		
	

	private static void methodOne(String str) {
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1);
		}
		String result=String.join(" ", words);
		System.out.println(result);
		
	}

	

}
