package practice;

public class Dulicates2 {

    public static void main(String[] args) {
    	int a[]= {1,4,2,6,3,6,2,4,6,1,2,6,3,1,5,0};
    	int b[]=new int[a.length];
    	int visited=-1;
    	for(int i=0;i<a.length;i++) {
    		int count=1;
    		for(int j=i+1;j<a.length;j++) {
    			if(a[i]==a[j]) {
    				b[j]=visited;
    				count++;
    			}
    		}
    		if(b[i]!=-1) {
    			b[i]=count;
    		}
    	}
    	for(int i=0;i<a.length;i++) {
    		if(b[i]!=-1 && b[i]>1) {
    			System.out.println(a[i]+":"+b[i]);
    		}
    	}
      
    }


}
