package practice;

public class CorePractice {
    public static void main(String[] args) {
    	  String str="java is a high level programming language";
    	  String[] res=str.toLowerCase().split(" ");
    	  String str1="";
    	  
    	  for(String ch:res) {
    		  ch=ch.substring(0,1).toUpperCase()+ch.substring(1);
    		  str1=str1+ch+" ";
    	  }
    	  System.out.println(str1);
    	  
    
    }

}
