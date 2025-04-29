package ListInterface;

import java.util.ArrayList;
import java.util.List;


public class Practice {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Blueberry");
        System.out.println(list);
        
        //accessing elements
        System.out.println(list.get(0));
        
        //adding multiple numbers using for each loop
        int[] numbers= {1,2,3,4,5};
        ArrayList<Integer> numberList=new ArrayList<>();
        for(int number:numbers) {
        	numberList.add(number);
        }
        System.out.println(numberList);
        
        //adding using while loop
//        int i=0;
//        while(i<numbers.length) {
//        	numberList.add(numbers[i]);
//        	  i++;
//        }
//        System.out.println(numberList);
        
        //removing elements
//        numberList.remove(9);
//        System.out.println(numberList);
        
        //removing last number
//        while(!numberList.isEmpty()) {
//        	numberList.remove(numberList.size()-1);
//        }
        
        System.out.println(numberList.indexOf(1));  //returns position of the element first occurrence
        System.out.println(numberList.indexOf(2));  //returns position of the element last occurrence
        System.out.println(numberList.size());     //returns size of list
        System.out.println(numberList.contains(1)); //return boolean value
//        numberList.clear();   // clear all the elements
        
        //converting elements to upper cast
        for(String fruit:list) {
        	System.out.print(fruit.toUpperCase()+" ");
        }
        System.out.println();
        
        //modifying list
        for(int i=0;i<numberList.size();i++) {
        	numberList.set(i,numberList.get(i)*10);
        }
        System.out.println(numberList);
      
        //modifying with new list
        ArrayList<String> al=new ArrayList<>();
        for(String fruit:list) {
        	al.add(fruit.toUpperCase());
        }
        System.out.println(al);
        
        List<String> sublist=list.subList(0, 2);
        System.out.println("Sub list of array  "+sublist);
        
        
        
	}
}
