package strings;

public class EqualParts{

    public static void main(String[] args) {
        String str = "hello world javaa hhh";
        int n=3;
        equalpartLength(str, n);
    }

    private static void equalpartLength(String str,int n) {
//    	str=str.toLowerCase().replace(" ", "");
    	str=str.toLowerCase().replaceAll("\\s", "");
    	
    	int partLength=str.length()/n;
    	int start=0;
    	int end=partLength;
    	if(str.length()%n==0) {
    		for(int i=0;i<n;i++) {
    			String str2=str.substring(start,end);
    			System.out.println((i+1)+" part :"+str2);
    			start=end;
    			end+=partLength;
    		}
    	}
    	else
    		System.out.println("cannot make equal parts");
    }
}

