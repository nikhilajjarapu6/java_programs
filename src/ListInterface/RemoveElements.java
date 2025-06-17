package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElements {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(5);
        numbers.add(15);
        numbers.add(8);
        numbers.add(22);
        numbers.add(3);
        System.out.println("original List "+numbers);
        
        Iterator<Integer> iterator=numbers.iterator();
        ArrayList<Integer> altNumber=new ArrayList<>();
        while(iterator.hasNext()) {
        	 Integer number = iterator.next();
        	if(number<10) {
        		altNumber.add(number);
        		iterator.remove();
        	}
        }
        
        System.out.println("Updated list "+altNumber);
        
        
        System.out.println("Modified List "+numbers);
		
	}
}
