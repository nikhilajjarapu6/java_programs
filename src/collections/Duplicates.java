package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Duplicates {
	
	public static void main(String[] args) {
		int a[] = {1, 4, 2, 6, 3, 6, 2, 4, 6, 1, 2, 6, 3, -1, 5, 0};
	    int visited = -1;
	    
	    ArrayList<Integer> al=new ArrayList<>();
	    for(int i=0;i<a.length;i++) {
	    	al.add(a[i]);
	    }
	    
	    Collections.sort(al);
	    int b[]=new int[al.size()];
	    for(int i=0;i<al.size();i++) {
	    	int count=1;
	    	if(b[i]==visited) {
	    		continue;
	    	}
	    	for(int j=i+1;j<al.size();j++) {
	    		if(al.get(i).equals(al.get(j))) {
	    			b[j]=visited;
	    			count++;
	    		}
	    	}
	    	b[i]=count;
	    }
	    for(int i=0;i<al.size();i++) {
	    	if(b[i]!=visited && b[i]==1) {
	    		System.out.println(al.get(i)+":"+b[i]);
	    	}
	    }
	}
	
}
