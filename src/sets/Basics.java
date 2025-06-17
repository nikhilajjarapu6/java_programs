package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Basics {
	public static void main(String[] args) {
		Set<String> fruitSet=new HashSet<>();
		fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Mango");
        fruitSet.add("Banana"); // Duplicate, won't be added
        fruitSet.add("Grapes");
        System.out.println("Set after adding elements: " + fruitSet);
        
        Set<String> treeSet=new TreeSet<>(fruitSet);
        System.out.println(treeSet);
        
        if(fruitSet.contains("apple")) {
        	System.out.println("yes set contains apple");
        }
        
        for(String fruit:fruitSet) {
        	System.out.println(fruit);
        }
        
        Iterator<String> iterator=fruitSet.iterator();
        while(iterator.hasNext()) {
        	if(iterator.next()=="Grapes"){
        		iterator.remove();
        	}
        }
        
       
	}
}
