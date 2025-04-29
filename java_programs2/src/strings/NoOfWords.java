package strings;

public class NoOfWords {

	public static void main(String[] args) {
String paragraph = "Java is a programming language and computing platform. It is fast, reliable, and secure. Java is widely used for developing applications in various domains.";
    	
    	paragraph= paragraph.replaceAll("[^a-zA-Z ]", "");  //removing special characters
    	 String[] words=paragraph.split("\\s+");
    	 
    	 int count=0;
    	 
    	 for(int i=0;i<words.length;i++) {
    		 count++;
    		 System.out.println(words[i]);
    	 }
    	 System.out.println(count);
	}

}
